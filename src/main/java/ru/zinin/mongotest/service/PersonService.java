package ru.zinin.mongotest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.zinin.mongotest.model.Person;
import ru.zinin.mongotest.persistence.PersonRepository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository repository;

    List<Person> personList = new ArrayList<Person>() {{
        add(new Person("1", "aaa", "bbb"));
        add(new Person("2", "ccc", "ddd"));
        add(new Person("3", "eee", "fff"));
    }};


    /*@PostConstruct
    public void go() {
        repository.saveAll(personList);
    }*/

    public List<Person> getAllPerson() {
       return repository.findAll();
    }
}
