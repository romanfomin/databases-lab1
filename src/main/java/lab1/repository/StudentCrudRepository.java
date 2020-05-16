package lab1.repository;

import lab1.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentCrudRepository extends CrudRepository<Student, Long> {
}
