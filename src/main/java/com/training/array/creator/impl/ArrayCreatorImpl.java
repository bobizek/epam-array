package com.training.array.creator.impl;

import com.training.array.creator.ArrayCreator;
import com.training.array.entity.CustomArray;
import com.training.array.exception.ArrayReaderException;
import com.training.array.parser.ArraySourceParser;
import com.training.array.reader.ArrayReader;
import com.training.array.validator.ArraySourceValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayCreatorImpl implements ArrayCreator {


    static final Logger logger = LogManager.getLogger(ArrayCreatorImpl.class);
    public ArraySourceParser parser;
    public ArraySourceValidator validator;
    public ArrayReader reader;

    public ArrayCreatorImpl(ArrayReader reader, ArraySourceParser parser, ArraySourceValidator validator) {
        this.reader = reader;
        this.parser = parser;
        this.validator = validator;
    }

    public CustomArray createIntegerArrayFromFile() throws ArrayReaderException {
        logger.info("AAAA");
        return parser.parseToInteger(reader.readArray());
    }
}
