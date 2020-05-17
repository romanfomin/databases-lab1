package lab1.repository.postgres;

import lab1.model.postgres.Subject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectCrudRepository extends CrudRepository<Subject, Long> {
}
