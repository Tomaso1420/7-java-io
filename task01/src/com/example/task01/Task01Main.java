package com.example.task01;

import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;

public class Task01Main {
    public static void main(String[] args) throws IOException {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        /*
        System.out.println(checkSumOfStream(new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01})));
        */

    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int checksum = 0;
        int byteValue;
        if (inputStream == null) {
            throw new IllegalArgumentException();
        }
        while ((byteValue = inputStream.read()) != -1) {
            checksum = Integer.rotateLeft(checksum, 1) ^ byteValue;
        }

        return checksum;
    }
}
