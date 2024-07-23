package com.decadev.repositories;

import com.decadev.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
//    Optional<Person> findByFirstName(String firstName);
//    List<Person> findBySurname(String surname);
//
//    Optional<Person> findByTelephone(String telephone);
//
//    List<Person> findByFirstNameAndSurname(String firstName, String surname);
}
