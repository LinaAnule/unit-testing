package com.academy2024.task4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class InputValidatorTest {

    public static Stream<Arguments> validEmailList() {
        return Stream.of(
                Arguments.of("user1@example.com"),
                Arguments.of("user2@gmail.com"),
                Arguments.of("user3@yes.lt"));
    }

    public static Stream<Arguments> invalidEmailList() {
        return Stream.of(
                Arguments.of("user1example.com"),
                Arguments.of("user2@examplecom"),
                Arguments.of("user3"));
    }

    public static Stream<Arguments> phoneNumbersList() {
        return Stream.of(
                Arguments.of("+37061226262"),
                Arguments.of("+37061226111"),
                Arguments.of("+37061226202"));
    }

    public static Stream<Arguments> invalidPhoneNumbersList() {
        return Stream.of(
                Arguments.of("+3761226262"),
                Arguments.of("+3706122611"),
                Arguments.of("+37041226111"),
                Arguments.of("+17041226111"),
                Arguments.of("+36041226111"),
                Arguments.of("37061226202"));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, -3, 15, Integer.MAX_VALUE})
    void isEven_ShouldReturnFalseForOddNumbers(int number) {
        boolean actualValue = InputValidator.isEven(number);
        assertFalse(actualValue);
    }

    @ParameterizedTest
    @ValueSource(ints = {8, 146, Integer.MAX_VALUE - 1})
    void isEven_ShouldReturnTrueForEvenNumbers(int number) {
        boolean actualValue = InputValidator.isEven(number);
        assertTrue(actualValue);
    }

    @ParameterizedTest
    @ValueSource(strings = {"a", "0"})
    void isBlank_ShouldReturnFalseForNonBlankStrings(String input) {
        boolean actualValue = InputValidator.isBlank(input);
        assertFalse(actualValue);

    }

    @ParameterizedTest
    @ValueSource(strings = {"", "  "})
    void isBlank_ShouldReturnTrueForEmptyOrBlankStrings(String input) {
        boolean actualValue = InputValidator.isBlank(input);
        assertTrue(actualValue);
    }

    @ParameterizedTest
    @MethodSource("validEmailList")
    public void isValidEmail_ShouldReturnTrueForValidStrings(String emailAddress) {
        boolean actualValue = InputValidator.isValidEmail(emailAddress);
        assertTrue(actualValue);
    }

    @ParameterizedTest
    @MethodSource("invalidEmailList")
    public void isValidEmail_ShouldReturnFalseForInvalidStrings(String emailAddress) {
        boolean actualValue = InputValidator.isValidEmail(emailAddress);
        assertFalse(actualValue);
    }


    @ParameterizedTest
    @MethodSource("phoneNumbersList")
    public void isValidPhoneNumber_ShouldReturnTrueForValidPhoneNumbers(String phoneNumber) {
        boolean actualValue = InputValidator.isValidPhoneNumber(phoneNumber);
        assertTrue(actualValue);
    }

    @ParameterizedTest
    @MethodSource("invalidPhoneNumbersList")
    public void isValidPhoneNumber_ShouldReturnFalseForInvalidPhoneNumbers(String phoneNumber) {
        boolean actualValue = InputValidator.isValidPhoneNumber(phoneNumber);
        assertFalse(actualValue);
    }

}