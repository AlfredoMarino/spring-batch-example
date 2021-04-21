package com.marino.alfredo.springbatchexample.processor;

import com.marino.alfredo.springbatchexample.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {

    private static final Logger LOGGER = LoggerFactory.getLogger(PersonItemProcessor.class);

    @Override
    public Person process(Person person) {
        Person newPerson = new Person(person.getFirstname().toUpperCase(), person.getLastname().toUpperCase(), person.getPhone());
        LOGGER.info("Transform from " + person + " to " + newPerson);
        return newPerson;
    }
}
