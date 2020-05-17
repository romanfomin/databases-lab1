package lab1.repository;

import lab1.model.Campus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampusCrudRepository extends CrudRepository<Campus, Long> {
}
