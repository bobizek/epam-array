package com.training.array.creator.impl;

import com.training.array.creator.ArrayCreator;
import com.training.array.entity.CustomArray;
import com.training.array.exception.ArrayReaderException;
import com.training.array.parser.ArraySourceParser;
import com.training.array.reader.ArrayReader;
import com.training.array.validator.ArraySourceValidator;

public class ArrayCreatorImpl implements ArrayCreator {

    public ArraySourceParser parser;
    public ArraySourceValidator validator;
    public ArrayReader reader;

    public ArrayCreatorImpl(ArrayReader reader, ArraySourceParser parser, ArraySourceValidator validator) {
        this.reader = reader;
        this.parser = parser;
        this.validator = validator;
    }

    public CustomArray createIntegerArrayFromFile() throws ArrayReaderException {
         return parser.parseToInteger(reader.readArray());
    }
}
