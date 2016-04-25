package org.bridj.cpp.com.dispatch;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.cpp.com.*;

import java.lang.reflect.InvocationTargetException;

public class IDispatchForJava extends IDispatch implements AggregatableIUnknown {
	//	private IDispatch standardDispatch;
	private IUnknown     outerUnknown;
	private DispatchInfo dispatchInfo;

	public IDispatchForJava() {
	}

	public void initOuterUnknown(IUnknown outerUnknown) {
		if (this.outerUnknown != null) {
			throw new IllegalStateException(getClass().getSimpleName() + " is already contained in another object.");
		}
		this.outerUnknown = outerUnknown;
		COMRuntime comRuntime = BridJ.getRuntimeByRuntimeClass(COMRuntime.class);
		dispatchInfo = comRuntime.getDispatchInfo(this.getClass());
	}

	private IUnknown getOuterUnknown() {
		if (outerUnknown == null) {
			new IUnknownForJava(this);
		}
		return outerUnknown;
	}

	@Override
	public int QueryInterface(
			Pointer<GUID> riid,
			Pointer<Pointer<Void>> ppvObject) {
		return getOuterUnknown().QueryInterface(riid, ppvObject);
	}

	@Override
	public int AddRef() {
		return getOuterUnknown().AddRef();
	}

	@Override
	public int Release() {
		return getOuterUnknown().Release();
	}

	@Override
	public int GetTypeInfoCount(Pointer<Integer> pctinfo) {
		if (pctinfo == null) {
			return COMStatus.E_INVALIDARG;
		}
		pctinfo.set(1);
		return COMStatus.S_OK;
	}

	@Override
	public int GetTypeInfo(int iTInfo, int lcid, Pointer<Pointer<Void>> ppTInfo) {
		if (ppTInfo == null) {
			return COMStatus.E_INVALIDARG;
		}
		ppTInfo.set(null);
		if (iTInfo != 0) {
			return COMStatus.DISP_E_BADINDEX;
		}
		ppTInfo.as(Pointer.pointerType(ITypeInfo.class)).set(Pointer.getPointer(dispatchInfo.getiTypeInfo()));
		return COMStatus.S_OK;
	}

	@Override
	public int GetIDsOfNames(
			Pointer<GUID> riid,//REFIID riid,
			Pointer<Pointer<Byte>> rgszNames,
			int cNames,
			int lcid, //LCID lcid,
			Pointer<Integer> rgDispId) { //DISPID *rgDispId);
		return OLEAutomationLibrary.DispGetIDsOfNames(Pointer.getPointer(dispatchInfo.getiTypeInfo()), rgszNames, cNames, rgDispId);
	}

	@Override
	public int Invoke(
			int dispIdMember,
			Pointer<GUID> riid,
			int lcid,
			short wFlags,
			Pointer<DISPPARAMS> pDispParams,
			Pointer<VARIANT> pVarResult,
			Pointer<EXCEPINFO> pExcepInfo,
			Pointer<Integer> puArgErr) {
		if (riid == null || pDispParams == null) {
			return COMStatus.DISP_E_MEMBERNOTFOUND;
		}
		if (!riid.get().toString().equals("00000000-0000-0000-0000-000000000000")) {
			return COMStatus.DISP_E_UNKNOWNINTERFACE;
		}

		DispatchMethodInfo methodInfo = dispatchInfo.getMethod(dispIdMember);
		if (methodInfo == null) {
			return COMStatus.DISP_E_MEMBERNOTFOUND;
		}

		if (puArgErr == null) {
			puArgErr = Pointer.allocateInt();
		}
		if (pVarResult == null) {
			pVarResult = Pointer.allocate(VARIANT.class);
		}
		try {
			Pointer<VARIANT> result = methodInfo.invoke(this, pDispParams, puArgErr);
			if (result != null && pVarResult != null) {
				OLEAutomationLibrary.VariantCopy(pVarResult, result);
			}
			return COMStatus.S_OK;
		} catch (InvocationTargetException e) {
			return COMStatus.DISP_E_EXCEPTION;
		} catch (IllegalAccessException e) {
			return COMStatus.DISP_E_EXCEPTION;
		} catch (COMStatus e) {
			return e.getHResult();
		}

//		try {
//			int invoke = iTypeInfo.get().invoke(Pointer.getPointer(this), dispIdMember, wFlags, pDispParams, pVarResult, pExcepInfo, puArgErr);
//			COMStatus.check(invoke);
//			return invoke;
//		} catch (Exception e) {
//			System.err.println(e);
//			return COMStatus.E_UNEXPECTED;
//		}

//		return OLEAutomationLibrary.DispInvoke(Pointer.getPointer(this), iTypeInfo, dispIdMember, wFlags, pDispParams, pVarResult, pExcepInfo, puArgErr);
	}
}
