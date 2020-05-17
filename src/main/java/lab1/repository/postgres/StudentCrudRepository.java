package lab1.repository.postgres;

import lab1.model.postgres.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentCrudRepository extends CrudRepository<Student, Long> {
}
