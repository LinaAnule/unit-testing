package com.academy2024.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class CalculatorTest {
    @InjectMocks
    private Calculator calculator;

    //addNumber
    @Test
    public void addNumber_shouldReturnCorrectSum_withPositiveNumbers() {
        int expectedSum = 3;
        int actualSum = calculator.addNumber(1, 2);
        assertEquals(expectedSum, actualSum);
    }


    @Test
    public void addNumber_shouldReturnCorrectSum_withNegativeNumbers() {
        int expectedSum = -3;
        int actualSum = calculator.addNumber(-1, -2);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void addNumber_shouldReturnCorrectSum_withZeroAndNegativeNumbers() {
        int expectedSum = -3;
        int actualSum = calculator.addNumber(0, -3);
        assertEquals(expectedSum, actualSum);
    }

    //subtractNumber
    @Test
    public void subtractNumbers_shouldReturnCorrectValue_withPositiveNumbers() {
        int expectedValue = 0;
        int actualValue = calculator.subtractNumber(1, 1);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void subtractNumbers_shouldReturnCorrectValue_withNegativeNumbers() {
        int expectedValue = 0;
        int actualValue = calculator.subtractNumber(-1, -1);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void subtractNumbers_shouldReturnCorrectValue_withZeroAndNegativeNumbers() {
        int expectedValue = 1;
        int actualValue = calculator.subtractNumber(0, -1);
        assertEquals(expectedValue, actualValue);
    }

    //multiplyNumber
    @Test
    public void multiplyNumbers_shouldReturnCorrectValue_withZeroAndNegativeNumbers() {
        int expectedValue = 0;
        int actualValue = calculator.multiplyNumber(0, -1);
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void multiplyNumbers_shouldReturnCorrectNumber_withPositiveNumbers() {
        int expectedValue = 10;
        int actualValue = calculator.multiplyNumber(2, 5);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void multiplyNumbers_shouldReturnCorrectValue_withNegativeNumbers() {
        int expectedValue = 1;
        int actualValue = calculator.multiplyNumber(-1, -1);
        assertEquals(expectedValue, actualValue);
    }

    //divideNumber
    @Test
    public void divideNumbers_shouldReturnCorrectNumber_withPositiveNumbers() {
        int expectedValue = 4;
        int actualValue = calculator.divideNumber(8, 2);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void divideNumbers_shouldReturnCorrectValue_withNegativeNumbers() {
        int expectedValue = 2;
        int actualValue = calculator.divideNumber(-4, -2);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void divideNumbers_shouldReturnCorrectValue_withZeroNumber() {
        int expectedValue = 0;
        int actualValue = calculator.divideNumber(0, 2);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void divideNumbers_shouldReturnCorrectValue_withZeroNumberAnDNegativeNumber() {
        int expectedValue = 0;
        int actualValue = calculator.divideNumber(0, -2);
        assertEquals(expectedValue, actualValue);
    }

    //bonus
    @Test
    public void divideNumbers_shouldReturnException_whenDividingByZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.divideNumber(1, 0);
        });
    }

    //findRemainder
    @Test
    public void findRemainder_shouldReturnCorrectNumber_withPositiveNumbers() {
        int expectedValue = 0;
        int actualValue = calculator.findRemainder(2, 2);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void findRemainder_shouldReturnCorrectValue_withNegativeNumbers() {
        int expectedValue = 0;
        int actualValue = calculator.findRemainder(-2, -2);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void findRemainder_shouldReturnCorrectValue_withZeroNumber() {
        int expectedValue = 0;
        int actualValue = calculator.findRemainder(0, 2);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void findRemainder_shouldReturnException_whenDividingByZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.findRemainder(1, 0);
        });
    }
}
