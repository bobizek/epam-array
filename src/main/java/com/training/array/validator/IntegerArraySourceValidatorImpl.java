package com.training.array.validator;

import com.training.array.validator.impl.ArraySourceValidatorImpl;

public class IntegerArraySourceValidatorImpl implements ArraySourceValidatorImpl {

    public boolean isValid(String line) {
        return line.matches("(\\d+\\s+)*\\d+");
    }

}
