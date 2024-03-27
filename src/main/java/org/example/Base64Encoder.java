package org.example;

import java.io.*;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Base64Encoder {
    private static final Logger logger = Logger.getLogger(Base64Encoder.class.getName());

    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try {
            FileInputStream fileInputStream = new FileInputStream(inputFile);
            byte[] fileBytes = new byte[fileInputStream.available()];
            fileInputStream.read(fileBytes);
            fileInputStream.close();

            byte[] encodedBytes = Base64.getEncoder().encode(fileBytes);

            FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
            fileOutputStream.write(encodedBytes);
            fileOutputStream.close();

            logger.log(Level.INFO, "File encoded successfully.");
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error encoding file: " + e.getMessage(), e);
        }
    }
}
