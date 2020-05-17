package lab1.repository;

import lab1.model.Time;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeCrudRepository extends CrudRepository<Time, Long> {
}
