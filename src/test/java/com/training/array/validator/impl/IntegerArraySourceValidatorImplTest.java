package com.training.array.validator.impl;

import com.training.array.validator.ArraySourceValidator;
import org.junit.jupiter.api.Test;

import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.*;

class IntegerArraySourceValidatorImplTest {

    @Test
    void isValid() {
        ArraySourceValidator validator = new IntegerArraySourceValidatorImpl();
        String line = "1M 2 3";
        assertFalse(validator.isValid(line));
    }
}