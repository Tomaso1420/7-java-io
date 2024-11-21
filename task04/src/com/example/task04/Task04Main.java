package com.example.task04;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        double sum = 0.0;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextDouble()) {
            sum += scanner.nextDouble();
        }
        System.out.printf("%.6f", sum);
    }
}
