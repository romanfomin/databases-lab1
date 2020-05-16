package lab1.repository;

import lab1.model.ControlType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ControlTypeCrudRepository extends CrudRepository<ControlType, Long> {
}
