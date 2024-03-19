package com.academy2024.task4;

import java.util.regex.Pattern;

public class PersonalCodeValidator {

    private static final String PERSONAL_CODE_REGX = "^(([3-6]\\d)(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])|([3-6]\\d)(24)(0[1-3])(0[1-9]|[12]\\d|3[01]))\\d{6}$";

    public static String printData(String personalCode) {
        String result;
        if (isValidPersonalCode(personalCode, PERSONAL_CODE_REGX)) {
            result = "This personal code belongs to " + determineGender(personalCode) + "who was born in " + determineBirthYear(personalCode);

        } else {
            result = "Invalid Lithuanian personal code.";
        }
        return result;
    }

    public static boolean isValidPersonalCode(String personalCode, String regex) {
        return Pattern.compile(regex)
                .matcher(personalCode)
                .matches();
    }

    public static Gender determineGender(String personalCode) {
        int genderIndicator = extractDigits(personalCode, 0, 1);
        if (genderIndicator == 4 || genderIndicator == 6) {
            return Gender.FEMALE;
        }
        return Gender.MALE;
    }

    public static String determineBirthYear(String personalCode) {
        int millenniumIndicator = extractDigits(personalCode, 0, 1);
        int year = extractDigits(personalCode, 1, 3);
        if (millenniumIndicator == 3 || millenniumIndicator == 4) {
            return "19" + year;
        }
        return "20" + year;
    }

    public static int extractDigits(String personalCode, int start, int end) {
        return Integer.parseInt(personalCode.substring(start, end));
    }
}
