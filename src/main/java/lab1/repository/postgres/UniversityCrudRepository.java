package lab1.repository.postgres;

import lab1.model.postgres.University;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversityCrudRepository extends CrudRepository<University, Long> {
}
