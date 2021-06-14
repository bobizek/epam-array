package com.training.array.validator;

import com.training.array.validator.impl.ArraySourceValidatorImpl;

public class IntegerArraySourceValidatorImpl implements ArraySourceValidatorImpl {

    private final static String LINE_MATCHER_REGEX = "(\\d+\\s+)*\\d+";

    public boolean isValid(String line) {
        return line.matches(LINE_MATCHER_REGEX);
    }

}
