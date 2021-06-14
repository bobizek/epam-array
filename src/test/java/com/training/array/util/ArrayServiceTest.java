package com.training.array.util;

import com.training.array.entity.CustomArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayServiceTest {

    @Test
    void minElement() {
        CustomArray array = new CustomArray(1, 2, 7, 3, 4, 10, 9, 11, 8);
        int expected = 1;
        int actual = ArrayService.minElement(array);
        assertEquals(actual, expected);
    }

    @Test
    void maxElement() {
        CustomArray array = new CustomArray(1, 2, 7, 3, 4, 10, 9, 11, 8);
        int expected = 11;
        int actual = ArrayService.minElement(array);
        assertEquals(actual, expected);
    }

    @Test
    void sumElements() {
    }

    @Test
    void makeElementsPositive() {
    }

    @Test
    void average() {
    }

    @Test
    void negativeElements() {
    }

    @Test
    void positiveElements() {
    }
}