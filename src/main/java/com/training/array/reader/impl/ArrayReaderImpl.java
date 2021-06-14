package com.training.array.reader.impl;

import com.training.array.entity.CustomArray;
import com.training.array.exception.ArrayReaderException;

public interface ArrayReaderImpl {
    CustomArray getIntegerArray()  throws ArrayReaderException;
}
