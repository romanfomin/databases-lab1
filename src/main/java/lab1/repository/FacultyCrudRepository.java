package lab1.repository;

import lab1.model.Faculty;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyCrudRepository extends CrudRepository<Faculty, Long> {
}
