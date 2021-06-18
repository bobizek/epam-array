package com.training.array.util;

import com.training.array.entity.CustomArray;

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

    public static int findMaxElement(CustomArray array) {
        int max = array.getAt(0);
        for (int i = 1; i < array.getLength(); ++i) {
            if (array.getAt(i) > max) {
                max = array.getAt(i);
            }
        }
        return max;
    }

    public static int sumElements(CustomArray array) {
        int sum = 0;
        for (int i = 0; i < array.getLength(); ++i) {
            sum += array.getAt(i);
        }
        return sum;
    }

    public static CustomArray makeElementsPositive(CustomArray array){
        for (int i = 0; i < array.getLength(); ++i) {
            if (array.getAt(i) < 0) {
                array.setAt(i, array.getAt(i) * (-1));
            }
        }
        return array;
    }

    public static float average(CustomArray array) {
        return (array.getLength() == 0 ? 0 : (float)ArrayService.sumElements(array) / array.getLength());
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

    public static int positiveElements(CustomArray array) {
        int pos = 0;
        for (int i = 0; i < array.getLength(); ++i) {
            if (array.getAt(i) > 0) {
                pos++;
            }
        }
        return pos;
    }
}
