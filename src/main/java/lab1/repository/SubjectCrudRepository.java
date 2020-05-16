package lab1.repository;

import lab1.model.Subject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectCrudRepository extends CrudRepository<Subject, Long> {
}
