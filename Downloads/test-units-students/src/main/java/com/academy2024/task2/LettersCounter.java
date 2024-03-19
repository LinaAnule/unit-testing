package com.academy2024.task2;

import java.util.List;

public class LettersCounter {
    public static int countLettersInString(char letter, String str) {
        int letterCount = 0;
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == letter) {
                letterCount += 1;
            }
        }
        return letterCount;
    }

    public static int countLettersInStrings(char letter, List<String> list) {
        int letterCount = 0;
        for (String str : list) {
            char[] array = str.toCharArray();
            for (int i = 0; i < array.length; i++) {
                if (array[i] == letter) {
                    letterCount += 1;
                }
            }
        }
        return letterCount;

    }
}
