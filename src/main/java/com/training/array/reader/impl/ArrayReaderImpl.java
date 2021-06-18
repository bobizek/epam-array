package com.training.array.reader.impl;

import com.training.array.exception.ArrayReaderException;
import com.training.array.reader.ArrayReader;
import com.training.array.validator.ArraySourceValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArrayReaderImpl implements ArrayReader {

    private final String filepath;
    private final ArraySourceValidator validator;
    static final Logger logger = LogManager.getLogger(ArrayReaderImpl.class);

    public ArrayReaderImpl(String filepath, ArraySourceValidator validator) {
        this.validator = validator;
        this.filepath = filepath;
    }

    public String readArray() throws ArrayReaderException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                if (validator.isValid(line)) {
                    logger.info("Received valid line containing values: " + line);
                    return line;
                }
            }
            logger.error("Source file doesn't contain any valid lines for parsing integer array");
            throw new ArrayReaderException("Source file doesn't contain any valid lines for parsing integer array");
        } catch (IOException e) {
            logger.error("Couldn't read array cause of " + e);
            throw new ArrayReaderException("Cannot read array: ", e);
        }
    }

}
