package ru.firsov.repositories;

import org.springframework.stereotype.Component;
import ru.firsov.entity.Person;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class PersonRepository {
    private List<Person> persons;

    @PostConstruct
    public void init() {
        persons = new ArrayList<>();
        persons.add(new Person("Kirill", 21));
    }

    public Person addPerson(Person person) {
        persons.add(person);
        return person;
    }

    public List<Person> getPersons() {
        return persons;
    }

}
