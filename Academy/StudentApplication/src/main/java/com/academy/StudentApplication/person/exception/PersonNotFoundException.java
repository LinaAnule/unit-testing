package com.academy.StudentApplication.person.exception;

public class PersonNotFoundException extends PersonException {

    public PersonNotFoundException(long pid) {
        super("Cannot find person with " + pid);
    }
}
