package com.training.array.parser.impl;

import com.training.array.entity.CustomArray;
import com.training.array.parser.ArraySourceParser;

public class ArraySourceParserImpl implements ArraySourceParser {

    private static final String LINE_SPLIT_REGEX = "\\s+";

    public CustomArray parseToInteger(String line) {
        CustomArray integerCustomArray = new CustomArray();
        for (String arrayChar : line.split(LINE_SPLIT_REGEX)) {
            integerCustomArray.put(Integer.parseInt(arrayChar));
        }
        return integerCustomArray;
    }
}
