package lab1.repository;

import lab1.model.Professor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorCrudRepository extends CrudRepository<Professor, Long> {
}
