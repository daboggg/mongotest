package ru.zinin.mongotest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.zinin.mongotest.model.Person;

@SpringBootApplication
public class MongotestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongotestApplication.class, args);
        Person person = new Person("kj","jh","lk");
    }

}

