package com.decadev.controllers;

import com.decadev.entities.Person;
import com.decadev.repositories.PersonRepository;
import com.decadev.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/people")
public class PersonController {

//    @Autowired
//    PersonRepository personRepository;
//
//    @GetMapping
//    ResponseEntity<?> findAll() {
//        return ResponseEntity.ok(personRepository.findAll());
//    }
    @Autowired
    PersonService personService;

    @GetMapping
    ResponseEntity<?> findAll() {
        return ResponseEntity.ok(personService.findAll());
    }
    @GetMapping("{id}")
    ResponseEntity<?> findById(@PathVariable Long id) {
        Person person = personService.findById(id).orElse(null);
        if (person == null) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Person with id of " + id  + " not found");
        }
        return ResponseEntity.ok(person);
    }

    @PostMapping
    ResponseEntity<?> save(@RequestBody Person person) {
        Person newPerson = personService.save(person);
        return ResponseEntity.ok(newPerson);
    }


}
