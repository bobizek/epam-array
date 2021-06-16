package com.training.array.validator.impl;

import com.training.array.validator.ArraySourceValidator;

public class IntegerArraySourceValidatorImpl implements ArraySourceValidator {

    private static final String LINE_MATCHER_REGEX = "(\\d+\\s+)*\\d+";

    public boolean isValid(String line) {
        return line.matches(LINE_MATCHER_REGEX);
    }

}
