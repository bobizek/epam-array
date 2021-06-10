package com.training.array.entity;

import java.util.Arrays;
import java.util.Objects;
import java.util.StringJoiner;

public class Array<T> {

    private final int initialCapacity = 8;

    private final Class<T> type;

    private T[] array;
    private int length;
    private int capacity;

    private Object object;
    private Objects objects;

    public Array(Class<T> type) {
        this.type = type;
        this.capacity = initialCapacity;
        this.array = (T[]) java.lang.reflect.Array.newInstance(type, this.capacity);
    }
    public Array(Class<T> type, T... values) {
        this(type);
        putAll(values);
    }

    public void put(T object) {
        if(array != null) {
            if(length == capacity) {
                capacity = capacity * 2 + 1;
                T[] pocket = array;
                array = (T[]) java.lang.reflect.Array.newInstance(type, capacity);
                System.arraycopy(pocket, 0, array, 0, length);
            }

            array[length++] = object;
        }
    }
    public void putAll(T... objects) {
        for (T object : objects) {
            put(object);
        }
    }
    public void switchTwo(int first, int last) {
        T buffer = array[first];
        array[first] = array[last];
        array[last] = buffer;
    }
    public T getAt(int index) {
        return array == null || length <= index ? null : array[index];
    }
    public void removeAt(int index) {
        if (array != null && length > index) {
            System.arraycopy(array, index + 1, array, index, length - index - 1);
            array[--length] = null;
        }
    }
    public int indexOf(T object) {
        if(array != null && array.length > 0) {
            for(int i=0; i<length; ++i)
            {
                if(array[i].equals(object))
                {
                    return i;
                }
            }
        }

        return -1;
    }
    public void clear() {
        if(array != null && length > 0)
        {
            for(int i = 0; i < length; ++i) {
                array[i] = null;
            }
        }
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
        // TODO: 10.06.21
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        // TODO: 10.06.21
        return super.hashCode();
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Array.class.getSimpleName() + "[", "]")
                .add("type=" + type)
                .add("array=" + Arrays.toString(array))
                .add("length=" + length)
                .add("capacity=" + capacity)
                .toString();
    }
}
