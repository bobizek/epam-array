package com.training.array.validation;

import com.training.array.entity.Array;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArraySerializationFileRepository implements ArraySerializationRepository {

    private final String filepath;

    public ArraySerializationFileRepository(String filepath) {
        this.filepath = filepath;
    }

    @Override
    public Array<Integer> getIntegerArray() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            Array<Integer> integerArray = new Array<>(Integer.class);

            String line = null;
            String[] splatLine = null;
            while ((line = reader.readLine()) != null) {
                splatLine = line.split("\\s*(\\s|,|-|\\.)\\s*");

                for (String arrayChar : splatLine) {
                    if (arrayChar.matches("\\d+")) {
                        integerArray.put(Integer.parseInt(arrayChar));
                    } else {
                        integerArray.clear();
                        break;
                    }
                }

                if(!integerArray.isEmpty()) {
                    break;
                }
            }
            return integerArray;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
