package com.training.array.util;

import com.training.array.entity.CustomArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayServiceTest {

    @Test
    void minElement() {
        CustomArray array = new CustomArray(1, 2, 7, 3, 4, 10, 9, 11, 8);
        int expected = 1;
        int actual = ArrayService.findMinElement(array);
        assertEquals(actual, expected);
    }

    @Test
    void maxElement() {
        CustomArray array = new CustomArray(1, 2, 7, 3, 4, 10, 9, 11, 8);
        int expected = 11;
        int actual = ArrayService.findMinElement(array);
        assertEquals(actual, expected);
    }

    @Test
    void sumElements() {
        CustomArray array = new CustomArray(1, 2, 3, 4);
        int expected = 10;
        int actual = ArrayService.sumElements(array);
        assertEquals(actual, expected);
    }

    @Test
    void makeElementsPositive() {
        CustomArray array = new CustomArray(1, 2, -3, 4, -6);
        CustomArray expected = new CustomArray(1, 2, 3, 4, 6);
        CustomArray actual = ArrayService.makeElementsPositive(array);
        assertEquals(actual, expected);
    }

    @Test
    void average() {
        CustomArray array = new CustomArray(5, 1, 3, 5);
        float expected = 3.5F;
        float actual = ArrayService.average(array);
        assertEquals(actual, expected);
    }

    @Test
    void negativeElements() {
        CustomArray array = new CustomArray(1, 2, -3, 4, -6, 8, 9);
        int expected = 2;
        int actual = ArrayService.negativeElements(array);
        assertEquals(actual, expected);
    }

    @Test
    void positiveElements() {
        CustomArray array = new CustomArray(1, 2, -3, 4, -6, 8, 9);
        int expected = 5;
        int actual = ArrayService.positiveElements(array);
        assertEquals(actual, expected);
    }
}