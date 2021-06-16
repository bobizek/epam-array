package com.training.array.creator;

import com.training.array.entity.CustomArray;
import com.training.array.exception.ArrayReaderException;

public interface ArrayCreator {
    CustomArray createIntegerArrayFromFile() throws ArrayReaderException;
}
