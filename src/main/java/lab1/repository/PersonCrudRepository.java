package lab1.repository;

import lab1.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonCrudRepository extends CrudRepository<Person, Long> {
}
