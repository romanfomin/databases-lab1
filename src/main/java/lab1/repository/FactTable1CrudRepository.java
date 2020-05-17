package lab1.repository;

import lab1.model.FactTable1;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FactTable1CrudRepository extends CrudRepository<FactTable1, Long> {
}
