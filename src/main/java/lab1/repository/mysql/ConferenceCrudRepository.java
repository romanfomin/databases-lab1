package lab1.repository.mysql;

import lab1.model.mysql.Conference;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConferenceCrudRepository extends CrudRepository<Conference, Long> {
}
