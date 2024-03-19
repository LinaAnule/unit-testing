package com.academy2024.task4;

import java.util.regex.Pattern;

public class InputValidator {

    private static final String EMAIL_REGEX = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
    private static final String PHONE_REGX = "^\\+3706\\d{7}$";

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isBlank(String input) {
        return input.isBlank() || input.isEmpty();
    }

    public static boolean isValidEmail(String emailAddress) {
        return Pattern.compile(EMAIL_REGEX)
                .matcher(emailAddress)
                .matches();
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        return Pattern.compile(PHONE_REGX)
                .matcher(phoneNumber)
                .matches();
    }
}
