package com.academy2024.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class LettersCounterTest {

    @Test
    public void countLettersInString_shouldReturnCorrectNumber_withOneOccurrence() {
        int expectedValue = 1;
        int actualValue = LettersCounter.countLettersInString('a', "Lina");
        Assertions.assertEquals(expectedValue, actualValue);
    }


    @Test
    public void countLettersInString_shouldReturnCorrectNumber_withMultipleOccurrences() {
        int expectedValue = 3;
        int actualValue = LettersCounter.countLettersInString('a', "Banana");
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void countLettersInString_shouldReturnZero_withNoOccurrences() {
        int expectedValue = 0;
        int actualValue = LettersCounter.countLettersInString('a', "Rope");
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void countLettersInString_shouldReturnZero_withStringIsEmpty() {
        int expectedValue = 0;
        int actualValue = LettersCounter.countLettersInString('a', "");
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void countLettersInStrings_shouldReturnZero_withStringIsEmpty() {
        int expectedValue = 0;
        List<String> list = new ArrayList<>(List.of(new String[]{"", "", ""}));
        int actualValue = LettersCounter.countLettersInStrings('a', list);
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void countLettersInStrings_shouldCorrectNumber_withOneOccurrence() {
        int expectedValue = 1;
        List<String> list = new ArrayList<>(List.of(new String[]{"", "Lab", ""}));
        int actualValue = LettersCounter.countLettersInStrings('a', list);
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void countLettersInStrings_shouldCorrectNumber_withMultipleOccurrence() {
        int expectedValue = 3;
        List<String> list = new ArrayList<>(List.of(new String[]{"Tab", "Lab", "Cab"}));
        int actualValue = LettersCounter.countLettersInStrings('a', list);
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void countLettersInStrings_shouldReturnZero_withListIsEmpty() {
        int expectedValue = 0;
        List<String> list = new ArrayList<>();
        int actualValue = LettersCounter.countLettersInStrings('a', list);
        Assertions.assertEquals(expectedValue, actualValue);
    }
}