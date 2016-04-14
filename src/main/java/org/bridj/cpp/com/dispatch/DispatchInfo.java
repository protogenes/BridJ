package org.bridj.cpp.com.dispatch;

import org.bridj.cpp.com.IDispatch;
import org.bridj.cpp.com.ITypeInfo;
import org.bridj.cpp.com.idl.DispId;

import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;

public class DispatchInfo {
	private final Class<? extends IDispatch>       dispatchClass;
	private final ITypeInfo                        iTypeInfo;
	private final Map<Integer, DispatchMethodInfo> methods;

	public DispatchInfo(Class<? extends IDispatch> dispatchClass, ITypeInfo iTypeInfo) {
		this.dispatchClass = dispatchClass;
		this.iTypeInfo = iTypeInfo;
		this.methods = collectMethods(dispatchClass, iTypeInfo);
	}

	private Map<Integer, DispatchMethodInfo> collectMethods(Class<?> dispatchClass, ITypeInfo iTypeInfo) {
		if (dispatchClass == Object.class) {
			return new LinkedHashMap<Integer, DispatchMethodInfo>();
		}

		Map<Integer, DispatchMethodInfo> result = collectMethods(dispatchClass.getSuperclass(), iTypeInfo);

		for (Method method : dispatchClass.getDeclaredMethods()) {
			DispId dispId = method.getAnnotation(DispId.class);
			if (dispId != null) {
				result.put(dispId.value(), new DispatchMethodInfo(dispId.value(), method, iTypeInfo));
			}
		}
		return result;
	}

	public ITypeInfo getiTypeInfo() {
		return iTypeInfo;
	}

	public DispatchMethodInfo getMethod(int dispatchId) {
		return methods.get(dispatchId);
	}
}
