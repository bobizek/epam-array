package com.training.array.util;

import com.training.array.entity.Array;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public final class Sorts {

	private static  <T> Array<T> quickSort(Array<T> array, int leftMarker, int rightMarker, Comparator<T> comparator) {

		int left = leftMarker;
		int right = rightMarker;
		T pivot = array.getAt((right + left) / 2);

		while (left <= right) {
			while (comparator.compare(pivot, array.getAt(left))  >  0) {
				++left;
			}

			while (comparator.compare(pivot, array.getAt(right))  <  0) {
				--right;
			}

			if (left <= right) {
				if (left < right) {
					array.switchTwo(left, right);
				}
				++left;
				--right;
			}
		}
		if (left < rightMarker) {
			quickSort(array, left, rightMarker, comparator);
		}

		if (leftMarker < right) {
			quickSort(array, leftMarker, right, comparator);
		}
		return array;
	}

	private static <T> Array<T> bubbleSort(Array<T> array, Comparator<T> comparator) {
	    for (int i = 0; i < array.length() - 1; ++i) {
				for (int j = array.length() - 1; j > i; --j) {
					if (comparator.compare(array.getAt(j - 1), array.getAt(j)) > 0) {
						array.switchTwo(j - 1, j);
					}
				}
			}
	    return array;
    }

    private static <T> Array<T> selectionSort(Array<T> array, Comparator<T> comparator) {
		for (int left = 0; left < array.length(); ++left) {
			int minIndex = left;
			for (int i = left; i < array.length(); ++i) {
				if (comparator.compare(array.getAt(i), array.getAt(minIndex)) < 0) {
					minIndex = i;
				}
			}
			array.switchTwo(left, minIndex);
		}
		return array;
	}

	private Sorts() { }

}
