package com.training.array.parser;

import com.training.array.entity.CustomArray;
import com.training.array.parser.impl.ArraySourceParserImpl;

public class ArraySourceParser implements ArraySourceParserImpl {

    private static final String LINE_SPLIT_REGEX = "\\\\s+\"";

    public CustomArray parseToInteger(String line) {
        CustomArray integerCustomArray = new CustomArray();
        for (String arrayChar : line.split(LINE_SPLIT_REGEX)) {
            integerCustomArray.put(Integer.parseInt(arrayChar));
        }
        return integerCustomArray;
    }
}
