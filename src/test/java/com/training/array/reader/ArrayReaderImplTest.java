package com.training.array.reader;

import com.training.array.reader.impl.ArrayReaderImpl;
import com.training.array.validator.impl.IntegerArraySourceValidatorImpl;
import org.junit.jupiter.api.Test;

class ArrayReaderImplTest {

    @Test
    void getIntegerArray() {
        IntegerArraySourceValidatorImpl validator = new IntegerArraySourceValidatorImpl();
        ArrayReaderImpl reader = new ArrayReaderImpl("src//main//resources//textfiles//file.txt", validator);
    }
}