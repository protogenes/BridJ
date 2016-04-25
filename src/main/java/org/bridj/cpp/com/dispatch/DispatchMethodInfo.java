package org.bridj.cpp.com.dispatch;

import org.bridj.BridJ;
import org.bridj.FlagSet;
import org.bridj.Pointer;
import org.bridj.SizeT;
import org.bridj.cpp.com.*;
import org.bridj.cpp.com.IDispatch.DISPPARAMS;
import org.bridj.cpp.com.ITypeInfo.*;
import org.bridj.cpp.com.OLEAutomationLibrary.DATE;
import org.bridj.cpp.com.VARIANT.VARIANT_BOOL;
import org.bridj.cpp.com.VARIANT.__VARIANT_NAME_1_union.__tagVARIANT.__VARIANT_NAME_3_union;
import org.bridj.cpp.com.idl.Retval;
import org.bridj.util.AnnotationUtils;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class DispatchMethodInfo {
	private static final Map<VARENUM, Type>      PARAMETER_TYPE_MAP = new HashMap<VARENUM, Type>();
	private static final Map<Class<?>, Class<?>> NATIVE_LOOKUP      = new HashMap<Class<?>, Class<?>>();

	static {
		PARAMETER_TYPE_MAP.put(VARENUM.VT_I2, Short.class);
		PARAMETER_TYPE_MAP.put(VARENUM.VT_I4, Integer.class);
		PARAMETER_TYPE_MAP.put(VARENUM.VT_R4, Float.class);
		PARAMETER_TYPE_MAP.put(VARENUM.VT_R8, Double.class);
		PARAMETER_TYPE_MAP.put(VARENUM.VT_CY, CY.class);
		PARAMETER_TYPE_MAP.put(VARENUM.VT_DATE, DATE.class);
		PARAMETER_TYPE_MAP.put(VARENUM.VT_BSTR, Pointer.pointerType(Character.class));
		PARAMETER_TYPE_MAP.put(VARENUM.VT_DISPATCH, Pointer.pointerType(IDispatch.class));
		PARAMETER_TYPE_MAP.put(VARENUM.VT_ERROR, Long.class);
		PARAMETER_TYPE_MAP.put(VARENUM.VT_BOOL, VARIANT_BOOL.class);
		PARAMETER_TYPE_MAP.put(VARENUM.VT_VARIANT, Pointer.pointerType(VARIANT.class));
		PARAMETER_TYPE_MAP.put(VARENUM.VT_UNKNOWN, Pointer.pointerType(IUnknown.class));
		PARAMETER_TYPE_MAP.put(VARENUM.VT_DECIMAL, DECIMAL.class);
		PARAMETER_TYPE_MAP.put(VARENUM.VT_I1, Byte.class);
		PARAMETER_TYPE_MAP.put(VARENUM.VT_UI1, Byte.class);
		PARAMETER_TYPE_MAP.put(VARENUM.VT_UI2, Short.class);
		PARAMETER_TYPE_MAP.put(VARENUM.VT_UI4, Integer.class);
		PARAMETER_TYPE_MAP.put(VARENUM.VT_I8, Long.class);
		PARAMETER_TYPE_MAP.put(VARENUM.VT_UI8, Long.class);
		PARAMETER_TYPE_MAP.put(VARENUM.VT_INT, Integer.class);
		PARAMETER_TYPE_MAP.put(VARENUM.VT_UINT, Integer.class);
		PARAMETER_TYPE_MAP.put(VARENUM.VT_INT_PTR, SizeT.class);
		PARAMETER_TYPE_MAP.put(VARENUM.VT_UINT_PTR, SizeT.class);
		PARAMETER_TYPE_MAP.put(VARENUM.VT_VOID, Void.class);
		PARAMETER_TYPE_MAP.put(VARENUM.VT_HRESULT, Short.class);
		PARAMETER_TYPE_MAP.put(VARENUM.VT_PTR, null);
		PARAMETER_TYPE_MAP.put(VARENUM.VT_SAFEARRAY, Pointer.pointerType(SAFEARRAY.class));
		PARAMETER_TYPE_MAP.put(VARENUM.VT_CARRAY, Pointer.class);
		PARAMETER_TYPE_MAP.put(VARENUM.VT_USERDEFINED, null);
		PARAMETER_TYPE_MAP.put(VARENUM.VT_LPSTR, Pointer.pointerType(Byte.class));
		PARAMETER_TYPE_MAP.put(VARENUM.VT_LPWSTR, Pointer.pointerType(Character.class));

		NATIVE_LOOKUP.put(Void.class, void.class);
		NATIVE_LOOKUP.put(Character.class, char.class);
		NATIVE_LOOKUP.put(Byte.class, byte.class);
		NATIVE_LOOKUP.put(Short.class, short.class);
		NATIVE_LOOKUP.put(Integer.class, int.class);
		NATIVE_LOOKUP.put(Long.class, long.class);
		NATIVE_LOOKUP.put(Float.class, float.class);
		NATIVE_LOOKUP.put(Double.class, double.class);
	}

	private final long               dispatchId;
	private final Method             method;
	private final FlagSet<VARENUM>[] parameterTypes;
	private final Type               retvalType;
	private final int                retvalIndex;

	public DispatchMethodInfo(long dispatchId, Method method, ITypeInfo iTypeInfo) {
		Type retvalType_ = null;
		int retvalIndex_ = -1;
		FlagSet<VARENUM>[] parameterTypes_ = null;

		Type[] parameterTypes = method.getGenericParameterTypes();
		Annotation[][] parameterAnnotations = method.getParameterAnnotations();
		short functionCount = getMethodCount(iTypeInfo);

		Pointer<Pointer<FUNCDESC>> pFuncDesc = Pointer.allocatePointer(FUNCDESC.class);
		for (int i = 0; i < functionCount; ++i) {
			COMStatus.check(iTypeInfo.getFuncDesc(i, pFuncDesc));
			try {
				FUNCDESC funcDesc = pFuncDesc.get().get();
				short parameterCount = funcDesc.cParams();

				parameterTypes_ = new FlagSet[parameterCount];
				if (funcDesc.memid() == dispatchId && parameterTypes.length >= parameterCount) {
					Pointer<ELEMDESC> parameterDescriptions = funcDesc.lprgelemdescParam();
					for (int p = 0, m = 0; p < parameterCount && m < parameterTypes.length; ++m) {
						if (AnnotationUtils.isAnnotationPresent(Retval.class, parameterAnnotations[m])) {
							retvalIndex_ = m;
						} else {
							evaluateParameter(iTypeInfo, method, parameterDescriptions.get(p), parameterTypes[m], parameterAnnotations[m]);
							parameterTypes_[p] = FlagSet.fromValue(parameterDescriptions.get(p).tdesc().vt());
							++p;
						}
					}

					if (retvalIndex_ >= 0) {
						retvalType_ = parameterTypes[retvalIndex_];
						if (retvalType_ instanceof ParameterizedType) {
							retvalType_ = ((ParameterizedType) retvalType_).getActualTypeArguments()[0];
						}
						evaluateParameter(iTypeInfo, method, funcDesc.elemdescFunc(), retvalType_, parameterAnnotations[retvalIndex_]);
					}

					break;
				}
			} finally {
				iTypeInfo.releaseFuncDesc(pFuncDesc.get());
			}
		}

		if (parameterTypes_ == null) {
			throw new IllegalStateException("@DispId(" + dispatchId + ") " + method + " was not found in the type definition.");
		}

		this.dispatchId = dispatchId;
		this.method = method;
		this.retvalType = retvalType_;
		this.retvalIndex = retvalIndex_;
		this.parameterTypes = parameterTypes_;
	}

	private void evaluateParameter(ITypeInfo iTypeInfo, Method method, ELEMDESC description, Type type, Annotation... annotations) {
		Type definition = extractType(iTypeInfo, description.tdesc(), type);
		if (!type.equals(definition) && !type.equals(NATIVE_LOOKUP.get(definition))) {
			throw new IllegalArgumentException("Illegal function definition " + method + " expected " + definition + " but found " + type);
		}
	}

	private Type extractType(ITypeInfo iTypeInfo, TYPEDESC description, Type type) {
		FlagSet<VARENUM> vt = FlagSet.fromValue(description.vt());
		if (vt.is(VARENUM.VT_USERDEFINED)) {
			Pointer<Pointer<ITypeInfo>> pInnerType = Pointer.allocatePointer(ITypeInfo.class);
			COMStatus.check(iTypeInfo.getRefTypeInfo(description.union().hreftype(), pInnerType));
			ITypeInfo innerType = pInnerType.get().get();
			Pointer<Pointer<TYPEATTR>> pTypeAttr = Pointer.allocatePointer(TYPEATTR.class);
			COMStatus.check(innerType.getTypeAttr(pTypeAttr));
			try {
				TYPEATTR typeAttr = pTypeAttr.get().get();

				FlagSet<TYPEKIND> typekind = FlagSet.fromValue(typeAttr.typekind());
				switch (typekind.toEnum()) {
					case TKIND_ENUM:
					case TKIND_RECORD:
					case TKIND_UNION:
					case TKIND_MODULE:
						long javaSize = BridJ.sizeOf(type);
						long comSize = typeAttr.cbSizeInstance();
						if (javaSize != comSize) {
							throw new IllegalArgumentException("The java type " + type + " with size " + javaSize + " does not match the COM " + typekind.toEnum() + " size of " + comSize);
						}
						return type;
					case TKIND_INTERFACE:
					case TKIND_DISPATCH:
					case TKIND_COCLASS:
						if (!(type instanceof Class)) {
							throw new IllegalArgumentException("The java type " + type + " is not a class.");
						}

						Pointer<GUID> iid = COMRuntime.getIID((Class) type);
						Pointer<GUID> clsid = COMRuntime.getCLSID((Class) type);
						boolean iidMatch = iid == null ? false : typeAttr.guid().toString().equalsIgnoreCase(iid.get().toString());
						boolean clsidMatch = clsid == null ? false : typeAttr.guid().toString().equalsIgnoreCase(clsid.get().toString());
						if (!iidMatch && !clsidMatch) {
							throw new IllegalArgumentException("The java type " + type + " does not support {" + typeAttr.guid() + "}");
						}
						return type;
					case TKIND_ALIAS:
						return extractType(iTypeInfo, typeAttr.tdescAlias(), type);
					default:
						throw new IllegalArgumentException("Unexpected type attributes " + typekind);
				}
			} finally {
				innerType.releaseTypeAttr(pTypeAttr.get());
			}
		} else if (vt.is(VARENUM.VT_PTR)) {
			if (!(type instanceof ParameterizedType) || ((ParameterizedType) type).getRawType() != Pointer.class) {
				throw new IllegalArgumentException();
			}

			Type innerType = extractType(iTypeInfo, description.union().lptdesc().get(), ((ParameterizedType) type).getActualTypeArguments()[0]);
			return Pointer.pointerType(innerType);
		} else if (vt.is(VARENUM.VT_CARRAY)) {
			if (!(type instanceof ParameterizedType) || ((ParameterizedType) type).getRawType() != Pointer.class) {
				throw new IllegalArgumentException();
			}

			ARRAYDESC arraydesc = description.union().lpadesc().get();
			Type innerType = extractType(iTypeInfo, arraydesc.tdescElem(), ((ParameterizedType) type).getActualTypeArguments()[0]);
			return Pointer.pointerType(innerType);
		} else {
			return PARAMETER_TYPE_MAP.get(vt.toEnum());
		}
	}

	private short getMethodCount(ITypeInfo iTypeInfo) {
		Pointer<Pointer<TYPEATTR>> pTypeAttr = Pointer.allocatePointer(TYPEATTR.class);
		COMStatus.check(iTypeInfo.getTypeAttr(pTypeAttr));
		TYPEATTR typeAttr = pTypeAttr.get().get();
		short functionCount = typeAttr.cFuncs();
		iTypeInfo.releaseTypeAttr(pTypeAttr.get());
		return functionCount;
	}

	public Pointer<VARIANT> invoke(IDispatch target, Pointer<DISPPARAMS> pDispParams, Pointer<Integer> puArgErr) throws InvocationTargetException, IllegalAccessException, COMStatus {
		Object[] parameters = new Object[method.getParameterTypes().length];
		if (retvalIndex >= 0) {
			parameters[retvalIndex] = Pointer.allocate(retvalType);
		}

		Pointer<VARIANT>[] variantArray = new Pointer[parameters.length];
		int p = 0;
		for (int i = 0; i < parameters.length; i++) {
			// don't allocate as array so that each variant is released by GC
			Pointer<VARIANT> pVariant = Pointer.allocate(VARIANT.class);
			variantArray[i] = pVariant;
			if (i != retvalIndex) {
				FlagSet<VARENUM> parameterType = parameterTypes[i];
				COMStatus.check(OLEAutomationLibrary.DispGetParam(pDispParams, p, (short) parameterType.value(), pVariant.next(p), puArgErr));
				parameters[i] = rawValue(pVariant.get());
				++p;
			}
		}

		Object invoke = method.invoke(target, parameters);
		if (invoke instanceof Number) {
			COMStatus.check(((Number) invoke).intValue());
		}

		if (retvalIndex >= 0) {
			variantArray[retvalIndex].get().setValue(((Pointer<?>) parameters[retvalIndex]).get());
			return variantArray[retvalIndex];
		}
		return null;
	}

	private Object rawValue(VARIANT variant) {
		FlagSet<VARENUM> vt = FlagSet.fromValue(variant.__VARIANT_NAME_1().__VARIANT_NAME_2().vt());
		__VARIANT_NAME_3_union v3 = variant.__VARIANT_NAME_1().__VARIANT_NAME_2().__VARIANT_NAME_3();
		if (vt.has(VARENUM.VT_BYREF)) {
			switch (vt.without(VARENUM.VT_BYREF).toEnum()) {
				case VT_I2:
					return v3.piVal();
				case VT_I4:
					return v3.plVal();
				case VT_R4:
					return v3.pfltVal();
				case VT_R8:
					return v3.pdblVal();
				case VT_CY:
					return v3.pcyVal();
				case VT_DATE:
					return v3.pdate();
				case VT_BSTR:
					return v3.pbstrVal();
				case VT_DISPATCH:
					return v3.ppdispVal();
				case VT_ERROR:
					return v3.pscode();
				case VT_BOOL:
					return v3.pboolVal();
				case VT_VARIANT:
					return v3.pvarVal();
				case VT_UNKNOWN:
					return v3.ppunkVal();
				case VT_DECIMAL:
					return v3.pdecVal();
				case VT_I1:
					return v3.pcVal();
				case VT_UI1:
					return v3.pbVal();
				case VT_UI2:
					return v3.puiVal();
				case VT_UI4:
					return v3.pulVal();
				case VT_I8:
					return v3.pllVal();
				case VT_UI8:
					return v3.pullVal();
				case VT_INT:
					return v3.pintVal();
				case VT_UINT:
					return v3.puintVal();
				case VT_ARRAY:
					return v3.pparray();
				default:
					throw new IllegalArgumentException("Cannot extract raw value of " + variant);
			}
		}
		switch (vt.toEnum()) {
			case VT_EMPTY:
				return null;
			case VT_I2:
				return v3.iVal();
			case VT_I4:
				return v3.lVal();
			case VT_R4:
				return v3.fltVal();
			case VT_R8:
				return v3.dblVal();
			case VT_CY:
				return v3.cyVal();
			case VT_DATE:
				return v3.date();
			case VT_BSTR:
				return v3.bstrVal();
			case VT_DISPATCH:
				return v3.pdispVal();
			case VT_ERROR:
				return v3.scode();
			case VT_BOOL:
				return v3.boolVal();
			case VT_UNKNOWN:
				return v3.punkVal();
			case VT_DECIMAL:
				return variant.__VARIANT_NAME_1().decVal();
			case VT_I1:
				return v3.cVal();
			case VT_UI1:
				return v3.bVal();
			case VT_UI2:
				return v3.uiVal();
			case VT_UI4:
				return v3.ulVal();
			case VT_I8:
				return v3.llVal();
			case VT_UI8:
				return v3.ullVal();
			case VT_INT:
				return v3.intVal();
			case VT_UINT:
				return v3.uintVal();
			case VT_ARRAY:
				return v3.parray();
			default:
				throw new IllegalArgumentException("Cannot extract raw value of " + variant);
		}
	}
}
