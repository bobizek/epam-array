package com.training.array.util;

import com.training.array.entity.CustomArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Sort {

	static final Logger logger = LogManager.getLogger(Sort.class);

	private static void checkArray(CustomArray array) {
		if (array == null || array.length() == 0) {
			logger.error("Sorting array cannot be null or empty");
			throw new IllegalArgumentException("Sorting array cannot be null or empty");
		}
	}

	public static CustomArray quickSort(CustomArray array) {
		checkArray(array);
		logger.debug("Sorting array: " + array);
		return (array.length() == 1) ? array : quickSort(array, 0, array.length() - 1);
	}

	private static CustomArray quickSort(CustomArray array, int leftMarker, int rightMarker) {

		int left = leftMarker;
		int right = rightMarker;
		int pivot = array.getAt((right + left) / 2);

		while (left <= right) {
			while (pivot > array.getAt(left)) {
				++left;
			}

			while (pivot < array.getAt(right)) {
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
			quickSort(array, left, rightMarker);
		}

		if (leftMarker < right) {
			quickSort(array, leftMarker, right);
		}
		return array;
	}

	public static CustomArray bubbleSort(CustomArray array) {

		checkArray(array);

	    for (int i = 0; i < array.length() - 1; ++i) {
				for (int j = array.length() - 1; j > i; --j) {
					if (array.getAt(j - 1) > array.getAt(j)) {
						array.switchTwo(j - 1, j);
					}
				}
			}
	    return array;
    }

    public static CustomArray selectionSort(CustomArray array) {

		checkArray(array);

		for (int left = 0; left < array.length(); ++left) {
			int minIndex = left;
			for (int i = left; i < array.length(); ++i) {
				if (array.getAt(i) < array.getAt(minIndex)) {
					minIndex = i;
				}
			}
			array.switchTwo(left, minIndex);
		}
		return array;
	}

	private Sort() { }

}
