package lab1.repository.awm;

import lab1.model.awm.Time;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeCrudRepository extends CrudRepository<Time, Long> {
}
