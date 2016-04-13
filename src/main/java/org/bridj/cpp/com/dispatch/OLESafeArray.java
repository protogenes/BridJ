package org.bridj.cpp.com.dispatch;

import org.bridj.Pointer;
import org.bridj.cpp.com.COMStatus;
import org.bridj.cpp.com.OLEAutomationLibrary;
import org.bridj.cpp.com.SAFEARRAY;

import java.util.AbstractList;

public class OLESafeArray<T> extends AbstractList<T> {
	private final Class<T>           elementType;
	private       Pointer<SAFEARRAY> safeArray;
	private final int[]              lowerBounds;
	private final int[]              upperBounds;
	private final int[]              indices;

	public static <T> OLESafeArray<T> wrap1(Class<T> elementType, Pointer<SAFEARRAY> safeArray) {
		return (OLESafeArray<T>) wrap(elementType, safeArray, 1);
	}

	public static <T> OLESafeArray<OLESafeArray<T>> wrap2(Class<T> elementType, Pointer<SAFEARRAY> safeArray) {
		return (OLESafeArray<OLESafeArray<T>>) wrap(elementType, safeArray, 2);
	}

	public static <T> OLESafeArray<OLESafeArray<OLESafeArray<T>>> wrap3(Class<T> elementType, Pointer<SAFEARRAY> safeArray) {
		return (OLESafeArray<OLESafeArray<OLESafeArray<T>>>) wrap(elementType, safeArray, 3);
	}

	public static <T> OLESafeArray<?> wrap(Class<T> elementType, Pointer<SAFEARRAY> safeArray, int expectedDimension) {
		int actualDimension = OLEAutomationLibrary.SafeArrayGetDim(safeArray);
		if (expectedDimension > 0 && expectedDimension != actualDimension) {
			throw new IllegalArgumentException("Dimension of SAFEARRAY does not match. Expected=" + expectedDimension + " Actual=" + actualDimension);
		}

		int[] lowerBounds = new int[actualDimension];
		int[] upperBounds = new int[actualDimension];
		Pointer<Integer> bound = Pointer.allocateInt();

		for (int i = 0; i < actualDimension; ++i) {
			COMStatus.check(OLEAutomationLibrary.SafeArrayGetLBound(safeArray, i + 1, bound));
			lowerBounds[i] = bound.getInt();
			COMStatus.check(OLEAutomationLibrary.SafeArrayGetUBound(safeArray, i + 1, bound));
			upperBounds[i] = bound.getInt();
		}

		return new OLESafeArray<T>(elementType, safeArray, lowerBounds, upperBounds, new int[0]);
	}

	private OLESafeArray(Class<T> elementType, Pointer<SAFEARRAY> safeArray, int[] lowerBounds, int[] upperBounds, int[] indices) {
		this.elementType = elementType;
		this.safeArray = safeArray;
		this.lowerBounds = lowerBounds;
		this.upperBounds = upperBounds;
		this.indices = indices;
	}

	@Override
	public T get(int index) {
		if (index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		for (int i = 0; i < indices.length; i++) {
			if (indices[i] < lowerBounds[i]) {
				return null;
			}
		}

		if (indices.length + 1 == lowerBounds.length) {
			Pointer<T> element = Pointer.allocate(elementType);
			Pointer<Integer> idx = Pointer.allocateInts(lowerBounds.length);
			for (int i = 0; i < indices.length; i++) {
				idx.set(i, indices[indices.length - 1 - i]);
			}
			idx.set(indices.length, index);
			COMStatus.check(OLEAutomationLibrary.SafeArrayGetElement(safeArray, idx, element));
			return element.get();
		}

		int[] idx = new int[indices.length + 1];
		System.arraycopy(indices, 0, idx, 0, indices.length);
		idx[indices.length] = index;
		return (T) new OLESafeArray<T>(elementType, safeArray, lowerBounds, upperBounds, idx);
	}

	@Override
	public int size() {
		return upperBounds[indices.length] + 1;
	}
}
