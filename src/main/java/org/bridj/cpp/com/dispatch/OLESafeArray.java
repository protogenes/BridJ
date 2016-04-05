package org.bridj.cpp.com.dispatch;

import org.bridj.CLong;
import org.bridj.Pointer;
import org.bridj.cpp.com.COMStatus;
import org.bridj.cpp.com.OLEAutomationLibrary;
import org.bridj.cpp.com.SAFEARRAY;

import java.util.AbstractList;

public class OLESafeArray<T> extends AbstractList<T> {
	private final Class<T>           elementType;
	private       Pointer<SAFEARRAY> safeArray;
	private final long[]             lowerBounds;
	private final long[]             upperBounds;
	private final long[]             indices;

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

		long[] lowerBounds = new long[actualDimension];
		long[] upperBounds = new long[actualDimension];
		Pointer<CLong> bound = Pointer.allocate(CLong.class);

		for (int i = 0; i < actualDimension; ++i) {
			COMStatus.check(OLEAutomationLibrary.SafeArrayGetLBound(safeArray, i + 1, bound));
			lowerBounds[i] = bound.getCLong();
			COMStatus.check(OLEAutomationLibrary.SafeArrayGetUBound(safeArray, i + 1, bound));
			upperBounds[i] = bound.getCLong();
		}

		return new OLESafeArray<T>(elementType, safeArray, lowerBounds, upperBounds, new long[0]);
	}

	private OLESafeArray(Class<T> elementType, Pointer<SAFEARRAY> safeArray, long[] lowerBounds, long[] upperBounds, long[] indices) {
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
			Pointer<CLong> clongs = Pointer.allocateCLongs(lowerBounds.length);
			for (int i = 0; i < indices.length; i++) {
				clongs.set(i, CLong.valueOf(indices[indices.length - 1 - i]));
			}
			clongs.set(indices.length, CLong.valueOf(index));
			COMStatus.check(OLEAutomationLibrary.SafeArrayGetElement(safeArray, clongs, element));
			return element.get();
		}

		long[] longs = new long[indices.length + 1];
		System.arraycopy(indices, 0, longs, 0, indices.length);
		longs[indices.length] = index;
		return (T) new OLESafeArray<T>(elementType, safeArray, lowerBounds, upperBounds, longs);
	}

	@Override
	public int size() {
		return (int) upperBounds[indices.length] + 1;
	}
}
