package com.training.array.entity;

import java.util.Arrays;
import java.util.StringJoiner;

public class CustomArray {

    private final int initialCapacity = 8;

    private int[] customArray;
    private int length;
    private int capacity;

    public CustomArray() {
        this.capacity = initialCapacity;
        this.customArray = new int[this.capacity];
    }

    public CustomArray(int... values) {
        this();
        putAll(values);
    }

    public void put(int object) {
        if(customArray != null) {
            if(length == capacity) {
                capacity = capacity * 2 + 1;
                int[] pocket = customArray;
                customArray = new int[capacity];
                System.arraycopy(pocket, 0, customArray, 0, length);
            }
            customArray[length++] = object;
        }
    }

    public void putAll(int... elements) {
        for (int element : elements) {
            put(element);
        }
    }

    public void switchTwo(int first, int last) {
        int buffer = customArray[first];
        customArray[first] = customArray[last];
        customArray[last] = buffer;
    }
    public int getAt(int index) {
        if (index >= length) {
            throw new IndexOutOfBoundsException("Provided index " + index + " while array length is " + length());
        }
        return customArray[index];
    }

    public void setAt(int index, int newValue) {
        if (index >= length) {
            throw new IndexOutOfBoundsException("Provided index " + index + " while array length is " + length());
        }
        customArray[index] = newValue;
    }

    public void removeAt(int index) {
        if (customArray != null && length > index) {
            System.arraycopy(customArray, index + 1, customArray, index, length - index - 1);
            customArray[--length] = 0;
        }
    }
    public int indexOf(int element) {
        if(customArray != null && customArray.length > 0) {
            for(int i = 0; i < length; ++i)
            {
                if(customArray[i] == element)
                {
                    return i;
                }
            }
        }
        return -1;
    }

    public void clear() {
        if(customArray != null && length > 0)
        {
            for(int i = 0; i < length; ++i) {
                customArray[i] = 0;
            }
        }
        length = 0;
    }

    public int length() {
        return length;
    }
    public int capacity() {
        return capacity;
    }
    public boolean isEmpty() {
        return length > 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomArray that = (CustomArray) o;
        return length == that.length && capacity == that.capacity && Arrays.equals(customArray, that.customArray);
    }

    @Override
    public int hashCode() {
        // TODO: 10.06.21
        return super.hashCode();
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CustomArray.class.getSimpleName() + " [", "]")
                .add("array = " + Arrays.toString(customArray))
                .add("length = " + length)
                .add("capacity = " + capacity)
                .toString();
    }
}
