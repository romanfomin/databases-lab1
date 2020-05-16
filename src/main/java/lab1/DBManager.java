package lab1;

import lab1.model.Person;
import lab1.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DBManager {

    @Autowired
    private PersonService personService;

    public void doDbOperations() {
        Person p = new Person("name1", 44);
        personService.addPerson(p);

        Iterable<Person> persons = personService.getPersons();
        System.out.println(persons);
    }
}
