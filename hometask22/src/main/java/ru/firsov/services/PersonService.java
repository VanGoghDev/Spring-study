package ru.firsov.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.firsov.entity.Person;
import ru.firsov.repositories.PersonRepository;

import java.util.List;

@Service
public class PersonService {
    private PersonRepository personRepository;

    @Autowired
    public void setPersonRepository(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getAllPersons() {
        return personRepository.getPersons();
    }

    public Person addPerson(Person person) {
        if (person == null) {
            return null;
        }
        return personRepository.addPerson(person);
    }
}
