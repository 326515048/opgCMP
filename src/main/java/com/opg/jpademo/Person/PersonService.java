package com.opg.jpademo.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fan.shijun on 2017-12-04.
 */
@RestController
@EnableAutoConfiguration
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    @RequestMapping("/person/save/{name}/{age}/{address}")
    public Person save(@PathVariable String name,
                       @PathVariable Integer age,
                       @PathVariable String address) {
        Person person = personRepository.save(new Person(null, name, age, address));
        return person;
    }
}
