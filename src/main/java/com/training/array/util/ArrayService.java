package com.training.array.util;

import com.training.array.entity.CustomArray;

public class ArrayService {

    public static int minElement(CustomArray array) {
        int min = array.getAt(0);
        for (int i = 1; i < array.length(); ++i) {
            if (array.getAt(i) < min) {
                min = array.getAt(i);
            }
        }
        return min;
    }

    public static int maxElement(CustomArray array) {
        int max = array.getAt(0);
        for (int i = 1; i < array.length(); ++i) {
            if (array.getAt(i) > max) {
                max = array.getAt(i);
            }
        }
        return max;
    }

    public static int sumElements(CustomArray array) {
        int sum = 0;
        for (int i = 0; i < array.length(); ++i) {
            sum += array.getAt(i);
        }
        return sum;
    }

    public static CustomArray makeElementsPositive(CustomArray array){
        for (int i = 0; i < array.length(); ++i) {
            if (array.getAt(i) < 0) {
                array.setAt(i, array.getAt(i) * (-1));
            }
        }
        return array;
    }

    public static float average(CustomArray array) {
        return (float)ArrayService.sumElements(array) / array.length();
    }

    public static int negativeElements(CustomArray array) {
        int negs = 0;
        for (int i = 0; i < array.length(); ++i) {
            if (array.getAt(i) < 0) {
                negs++;
            }
        }
        return negs;
    }

    public static float positiveElements(CustomArray array) {
        int pos = 0;
        for (int i = 0; i < array.length(); ++i) {
            if (array.getAt(i) > 0) {
                pos++;
            }
        }
        return pos;
    }

}
