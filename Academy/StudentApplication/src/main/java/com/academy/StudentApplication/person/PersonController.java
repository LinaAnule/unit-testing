package com.academy.StudentApplication.person;

import com.academy.StudentApplication.person.exception.PersonNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "api/persons")
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping(produces = "application/json")
    ResponseEntity<List<Person>> getAllPersons() {
        List<Person> list = personService.getAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("{pid}")
    ResponseEntity<Person> getByPid(@PathVariable("pid") Long pid) {
        try {
            Person person = personService.getById(pid);
            return new ResponseEntity<>(person, HttpStatus.OK);
        } catch (PersonNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
