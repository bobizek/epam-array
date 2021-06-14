package com.training.array.parser;

import com.training.array.entity.CustomArray;
import com.training.array.parser.impl.ArraySourceParserImpl;

public class ArraySourceParser implements ArraySourceParserImpl {

    public CustomArray parseToInteger(String line) {
        CustomArray integerCustomArray = new CustomArray();
        for (String arrayChar : line.split("\\s+")) {
            integerCustomArray.put(Integer.parseInt(arrayChar));
        }
        return integerCustomArray;
    }
}
