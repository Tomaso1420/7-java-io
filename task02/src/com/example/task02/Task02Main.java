package com.example.task02;

import java.io.IOException;
import java.io.InputStream;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;

        int first = inputStream.read();
        int second = inputStream.read();

        while (first != -1) {
            if (first != 13 || second != 10) {
                System.out.write(first);
            }
            first = second;
            second = inputStream.read();
        }
        System.out.flush();
    }
}
