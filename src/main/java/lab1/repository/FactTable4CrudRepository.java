package lab1.repository;

import lab1.model.FactTable4;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FactTable4CrudRepository extends CrudRepository<FactTable4, Long> {
}
