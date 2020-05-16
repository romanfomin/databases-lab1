package lab1.service;

import lab1.model.Person;
import lab1.repository.PersonCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonService {

    @Autowired
    private PersonCrudRepository personCrudRepository;

    @Transactional
    public void addPerson(Person p) {
        personCrudRepository.save(p);
    }

    @Transactional
    public  void removeAll() {
        personCrudRepository.deleteAll();
    }

    @Transactional
    public Iterable<Person> getPersons() {
        return personCrudRepository.findAll();
    }
}
