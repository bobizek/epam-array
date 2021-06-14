package com.training.array.validator;

public class IntegerArraySourceValidatorImpl implements ArraySourceValidatorImpl {

    public boolean isValid(String line) {
        return line.matches("(\\d+\\s+)*\\d+");
    }

}
