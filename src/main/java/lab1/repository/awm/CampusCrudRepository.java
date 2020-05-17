package lab1.repository.awm;

import lab1.model.awm.Campus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampusCrudRepository extends CrudRepository<Campus, Long> {
}
