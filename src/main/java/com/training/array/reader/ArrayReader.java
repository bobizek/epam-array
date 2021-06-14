package com.training.array.reader;

import com.training.array.entity.CustomArray;
import com.training.array.exception.ArrayReaderException;
import com.training.array.parser.ArraySourceParser;
import com.training.array.reader.impl.ArrayReaderImpl;
import com.training.array.validator.impl.ArraySourceValidatorImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArrayReader implements ArrayReaderImpl {

    private final String filepath;
    private final ArraySourceParser parser;
    private final ArraySourceValidatorImpl validator;
    static final Logger logger = LogManager.getLogger(ArrayReader.class);

    public ArrayReader(String filepath, ArraySourceParser parser, ArraySourceValidatorImpl validator) {
        this.parser = parser;
        this.validator = validator;
        this.filepath = filepath;
    }


    public CustomArray getIntegerArray() throws ArrayReaderException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                if (validator.isValid(line)) {
                    logger.info("Received valid line containing values: " + line);
                    return parser.parseToInteger(line);
                }
            }
            logger.error("Source file doesn't contain any valid lines for parsing integer array");
            throw new ArrayReaderException("Source file doesn't contain any valid lines for parsing integer array");
        } catch (IOException e) {
            logger.error("Couldn't read array cause of " + e.getMessage());
            throw new ArrayReaderException("Cannot read array", e);
        }
    }

}
