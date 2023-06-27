package com.cemkaya;

import java.util.Scanner;

public class Console {
    // Since the initializing the `Scanner` object is an implementation detail,
    // the variable is declared as private.
    private static Scanner scanner = new Scanner(System.in);

    // Although the overloaded method is not necessary, it is declared due to reinforce concepts.
    public static double readNumber(String prompt) {
        return scanner.nextDouble();
    }

    // Enforce user to enter valid values.
    public static double readNumber(String prompt, double min, double max) {
        double value = 0;

        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max) {
                return value;
            }
            System.out.printf("The value must be between %.0f and %.0f.%n", min, max);
        }
    }
}
