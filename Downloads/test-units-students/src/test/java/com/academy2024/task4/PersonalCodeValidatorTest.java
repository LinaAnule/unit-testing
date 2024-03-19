package com.academy2024.task4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class PersonalCodeValidatorTest {

    public static Stream<Arguments> invalidPersonalCodeList() {
        return Stream.of(
                Arguments.of("9008011234"),
                Arguments.of("10080112345"),
                Arguments.of("100801123"),
                Arguments.of("1008011234a"),
                Arguments.of("2008011234 "));
    }

    @Test
    public void personal_code_validator_should_print_female_born_1995() {
        final String expected = "This personal code belongs to female who was born in 1995";
        final String actual = PersonalCodeValidator.printData("49508011234");
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void personal_code_validator_should_print_male_born_2010() {
        final String expected = "This personal code belongs to male who was born in 2010";
        final String actual = PersonalCodeValidator.printData("51008011234");
        assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("invalidPersonalCodeList")
    public void personal_code_validator_should_print_invalid_lithuanian_personal_code() {
        final String expected = "Invalid Lithuanian personal code.";
        final String actual = PersonalCodeValidator.printData("1008011234");
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void personal_code_validator_should_print_male_born_2020() {
        final String expected = "This personal code belongs to male who was born in 2020";
        final String actual = PersonalCodeValidator.printData("52002291234");
        assertThat(actual).isEqualTo(expected);
    }

}