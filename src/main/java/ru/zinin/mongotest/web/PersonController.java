package ru.zinin.mongotest.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.zinin.mongotest.model.Person;
import ru.zinin.mongotest.service.PersonService;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/persons")
    public List<Person> getAllPerson() {
      return   personService.getAllPerson();
    }
}
