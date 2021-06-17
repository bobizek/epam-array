package com.training.array.util;

import com.training.array.entity.CustomArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StreamServiceTest {

    @Test
    void findMinElement() {
        CustomArray array = new CustomArray(1, 2, 7, 3, 4, 10, 9, 11, 8);
        int expected = 1;
        int actual = StreamService.findMinElement(array);
        assertEquals(expected, actual);
    }

    @Test
    void findMaxElement() {
        CustomArray array = new CustomArray(1, 2, 7, 3, 4, 10, 9, 11, 8);
        int expected = 11;
        int actual = StreamService.findMaxElement(array);
        assertEquals(expected, actual);
    }

    @Test
    void sumElements() {
        CustomArray array = new CustomArray(1, 2, 3, 4);
        int expected = 10;
        int actual = StreamService.sumElements(array);
        assertEquals(expected, actual);
    }

    @Test
    void makeElementsPositive() {
        CustomArray array = new CustomArray(1, 2, -3, 4, -6);
        CustomArray expected = new CustomArray(1, 2, 3, 4, 6);
        CustomArray actual = StreamService.makeElementsPositive(array);
        assertEquals(expected, actual);
    }

    @Test
    void average() {
        CustomArray array = new CustomArray(5, 1, 3, 5);
        double expected = 3.5;
        double actual = StreamService.average(array);
        assertEquals(expected, actual);
    }

    @Test
    void negativeElements() {
        CustomArray array = new CustomArray(1, 2, -3, 4, -6, 8, 9);
        int expected = 2;
        long actual = StreamService.negativeElements(array);
        assertEquals(expected, actual);
    }

    @Test
    void positiveElements() {
        CustomArray array = new CustomArray(1, 2, -3, 4, -6, 8, 9);
        int expected = 5;
        long actual = StreamService.positiveElements(array);
        assertEquals(expected, actual);
    }
}