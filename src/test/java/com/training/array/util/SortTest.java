package com.training.array.util;

import com.training.array.entity.CustomArray;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SortTest {

    @Test
    public void quickSort() {
        CustomArray actual = new CustomArray(1, 2, 7, 3, 4, 10, 9, 11, 8);
        CustomArray expected = new CustomArray(1, 2, 3, 4, 7, 8, 9, 10, 11);
        Assertions.assertEquals(Sort.quickSort(actual), expected);
    }


    @Test
    public void quickSortNullArray() {
        Assert.assertThrows(IllegalArgumentException.class, () -> Sort.quickSort(null));
    }

    @Test
    public void quickSortEmptyArray() {
        CustomArray emptyArray = new CustomArray();
        Assert.assertThrows(IllegalArgumentException.class, () -> Sort.quickSort(emptyArray));
    }

    @Test
    public void bubbleSort() {
        CustomArray actual = new CustomArray(1, 2, 7, 3, 4, 10, 9, 11, 8);
        CustomArray expected = new CustomArray(1, 2, 3, 4, 7, 8, 9, 10, 11);
        Assertions.assertEquals(Sort.bubbleSort(actual), expected);
    }

    @Test
    public void selectionSort() {
        CustomArray actual = new CustomArray(1, 2, 7, 3, 4, 10, 9, -11, 8);
        CustomArray expected = new CustomArray(-11, 1, 2, 3, 4, 7, 8, 9, 10);
        Assertions.assertEquals(Sort.selectionSort(actual), expected);
    }

}