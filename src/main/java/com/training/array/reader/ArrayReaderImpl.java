package com.training.array.reader;

import com.training.array.entity.CustomArray;
import com.training.array.exception.ArrayReaderException;

public interface ArrayReaderImpl {
    CustomArray getIntegerArray()  throws ArrayReaderException;
}
