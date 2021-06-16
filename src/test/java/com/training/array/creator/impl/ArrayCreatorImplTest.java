package com.training.array.creator.impl;

import com.training.array.creator.ArrayCreator;
import com.training.array.entity.CustomArray;
import com.training.array.exception.ArrayReaderException;
import com.training.array.parser.ArraySourceParser;
import com.training.array.parser.impl.ArraySourceParserImpl;
import com.training.array.reader.ArrayReader;
import com.training.array.reader.impl.ArrayReaderImpl;
import com.training.array.validator.ArraySourceValidator;
import com.training.array.validator.impl.IntegerArraySourceValidatorImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayCreatorImplTest {

    @Test
    void createIntegerArrayFromFile() throws ArrayReaderException {
        ArraySourceValidator validator = new IntegerArraySourceValidatorImpl();
        ArraySourceParser parser = new ArraySourceParserImpl();
        ArrayReader reader = new ArrayReaderImpl("src//main//resources//textfiles//file.txt", validator);
        ArrayCreator creator = new ArrayCreatorImpl(reader, parser, validator);
        CustomArray arr = creator.createIntegerArrayFromFile();
        System.out.println(arr);
    }
}