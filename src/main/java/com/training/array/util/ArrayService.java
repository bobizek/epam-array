package com.training.array.util;

import com.training.array.entity.CustomArray;
import java.util.stream.IntStream;

public class ArrayService {

    public static int findMinElement(CustomArray array) {
        int min = array.getAt(0);
        for (int i = 1; i < array.getLength(); ++i) {
            if (array.getAt(i) < min) {
                min = array.getAt(i);
            }
        }
        return min;
    }

    public static int findMinElementUsingStream(CustomArray array) {
        return IntStream.of(array.getPrimitive()).min().orElseThrow(IllegalArgumentException::new);
    }

    public static int findMaxElement(CustomArray array) {
        int max = array.getAt(0);
        for (int i = 1; i < array.getLength(); ++i) {
            if (array.getAt(i) > max) {
                max = array.getAt(i);
            }
        }
        return max;
    }

    public static int findMaxElementUsingStream(CustomArray array) {
        return IntStream.of(array.getPrimitive()).max().orElseThrow(IllegalArgumentException::new);
    }

    public static int sumElements(CustomArray array) {
        int sum = 0;
        for (int i = 0; i < array.getLength(); ++i) {
            sum += array.getAt(i);
        }
        return sum;
    }

    public static int sumElementsUsingStream(CustomArray array) {
        return IntStream.of(array.getPrimitive()).sum();
    }

    public static CustomArray makeElementsPositive(CustomArray array){
        for (int i = 0; i < array.getLength(); ++i) {
            if (array.getAt(i) < 0) {
                array.setAt(i, array.getAt(i) * (-1));
            }
        }
        return array;
    }

    public static CustomArray makeElementsPositiveUsingStream(CustomArray array) {
        IntStream.of(array.getPrimitive()).forEach(value -> value *= value < 0 ? -1 : 1);
        return array;
    }

    public static float average(CustomArray array) {
        return (float)ArrayService.sumElements(array) / array.getLength();
    }

    public static double averageUsingStream(CustomArray array) {
        return IntStream.of(array.getPrimitive()).average().getAsDouble();
    }

    public static int negativeElements(CustomArray array) {
        int negs = 0;
        for (int i = 0; i < array.getLength(); ++i) {
            if (array.getAt(i) < 0) {
                negs++;
            }
        }
        return negs;
    }

    public static long negativeElementsUsingStream(CustomArray array) {
        return IntStream.of(array.getPrimitive()).filter(value -> value < 0).count();
    }

    public static int positiveElements(CustomArray array) {
        int pos = 0;
        for (int i = 0; i < array.getLength(); ++i) {
            if (array.getAt(i) > 0) {
                pos++;
            }
        }
        return pos;
    }

    public static long positiveElementsUsingStream(CustomArray array) {
        return IntStream.of(array.getPrimitive()).filter(value -> value > 0).count();
    }

}
