package com.training.array.util;

import com.training.array.entity.CustomArray;

import java.util.stream.IntStream;

public class StreamService {

    public static int findMinElement(CustomArray array) {
        return IntStream.of(array.getPrimitive()).min().orElseThrow(IllegalArgumentException::new);
    }

    public static int findMaxElement(CustomArray array) {
        return IntStream.of(array.getPrimitive()).max().orElseThrow(IllegalArgumentException::new);
    }

    public static int sumElements(CustomArray array) {
        return IntStream.of(array.getPrimitive()).sum();
    }

    public static CustomArray makeElementsPositive(CustomArray array) {
        int[] values = array.getPrimitive();
        array.clear();
        array.putAll(IntStream.of(values).map(value -> value * (value < 0 ? -1 : 1)).toArray());
        return array;
    }

    public static double average(CustomArray array) {
        return IntStream.of(array.getPrimitive()).average().getAsDouble();
    }

    public static long negativeElements(CustomArray array) {
        return IntStream.of(array.getPrimitive()).filter(value -> value < 0).count();
    }


    public static long positiveElements(CustomArray array) {
        return IntStream.of(array.getPrimitive()).filter(value -> value > 0).count();
    }

}
