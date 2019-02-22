package ru.zinin.mongotest.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ru.zinin.mongotest.model.Person;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> {

}
