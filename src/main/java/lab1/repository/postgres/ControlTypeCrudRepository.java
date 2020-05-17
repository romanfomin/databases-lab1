package lab1.repository.postgres;

import lab1.model.postgres.ControlType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ControlTypeCrudRepository extends CrudRepository<ControlType, Long> {
}
