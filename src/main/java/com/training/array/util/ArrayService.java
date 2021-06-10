package com.training.array.util;

import com.training.array.entity.Array;

public class ArrayService {

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; ++i) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static <T extends Comparable<T>> T min(Array<T> array) {
        T min = array.getAt(0);
        for (int i = 1; i < array.length(); ++i) {
            if (array.getAt(i).compareTo(min) < 0) {
                min = array.getAt(i);
            }
        }
        return min;
    }

    public static <T> T max(Array<T> array) {
        T max = array.getAt(0);
        for (int i = 1; i < array.length(); ++i) {
            if (array.getAt(i) > max) {
                max = array.getAt(i);
            }
        }
        return max;
    }

    public static String max(String[] array) {
        String max = array[0];
        for (int i = 1; i < array.length; ++i) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; ++i) {
            sum += array[i];
        }
        return sum;
    }

    public static int[] positiveArray(int[] array){
        for (int i = 0; i < array.length; ++i) {
            if (array[i] < 0) {
                array[i] = array[i]*(-1);
            }
        }
        return array;
    }

    public static float average(int[] array) {
        return ArrayService.sum(array) / array.length;
    }

    public static int negatives(int[] array) {
        int negs = 0;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] < 0) {
                negs++;
            }
        }
        return negs;
    }

    public static float positives(int[] array) {
        int pos = 0;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] > 0) {
                pos++;
            }
        }
        return pos;
    }

    public ArrayService() {
    }
}
