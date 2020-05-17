package lab1.repository;

import lab1.model.Conference;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConferenceCrudRepository extends CrudRepository<Conference, Long> {
}
