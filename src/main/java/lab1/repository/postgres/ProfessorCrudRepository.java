package lab1.repository.postgres;

import lab1.model.postgres.Professor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorCrudRepository extends CrudRepository<Professor, Long> {
}
