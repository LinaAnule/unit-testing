package com.academy.StudentApplication.person;

import com.academy.StudentApplication.person.exception.PersonNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    private final PersonRepository personRepository;


    @Autowired
    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;

    }

    @Override
    public List<Person> getAll() {
        List<Person> list = new ArrayList<>(personRepository.findAll());
        return list;
    }

    @Override
    public Person getById(long pid) throws PersonNotFoundException {
        return personRepository.findById(pid).orElseThrow(() -> new PersonNotFoundException(pid));
    }
}
