package com.academy2024.task1;

public class Calculator {


    public int addNumber(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    public int subtractNumber(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }

    public int multiplyNumber(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }

    //bonus to implement it with exception
    public int divideNumber(int numberOne, int numberTwo) {
        if (numberTwo != 0) {
            return numberOne / numberTwo;
        }
        throw new ArithmeticException("Division by zero");

    }

    public int findRemainder(int numberOne, int numberTwo) {
        if (numberTwo != 0) {
            return numberOne % numberTwo;
        }
        throw new ArithmeticException("Division by zero");
    }
}
