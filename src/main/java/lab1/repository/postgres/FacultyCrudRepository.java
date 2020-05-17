package lab1.repository.postgres;

import lab1.model.postgres.Faculty;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyCrudRepository extends CrudRepository<Faculty, Long> {
}
