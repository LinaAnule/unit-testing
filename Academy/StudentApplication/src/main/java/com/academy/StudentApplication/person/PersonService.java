package com.academy.StudentApplication.person;

import com.academy.StudentApplication.person.exception.PersonNotFoundException;

import java.util.List;

public interface PersonService {
    List<Person> getAll();

    Person getById(long pid) throws PersonNotFoundException;

}
