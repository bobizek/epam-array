package com.training.array;

import com.training.array.util.Sorts;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SortsTest {

    @Test
    void quickSortIntArray() {
        int[] testingIntArray = new int[]{1, 2, 7, 3, 4, 10, 9, 11, 8};
        int[] sortedIntArray = new int[]{1, 2, 3, 4, 7, 8, 9, 10, 11};
        assertArrayEquals(Sorts.quickSort(testingIntArray), sortedIntArray);
    }

    @Test
    void quickSortStringArray() {
        String[] sortedStringArray = new String[]{"2", "2", "3", "4", "55", "A", "C", "Z", "a", "b", "z"};
        String[] testingStringArray = new String[]{"Z", "C", "A", "a", "z", "b", "3", "2", "4", "2", "55"};
        assertArrayEquals(Sorts.quickSort(testingStringArray), sortedStringArray);
    }

    @Test
    void quickSortNullArray() {
        String[] nullStringArray = null;
        Sorts.quickSort(nullStringArray);
    }

    @Test
    void quickSortEmptyArray() {
        String[] emptyStringArray = new String[0];
        Sorts.quickSort(emptyStringArray);
    }
}