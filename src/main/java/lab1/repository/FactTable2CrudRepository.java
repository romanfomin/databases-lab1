package lab1.repository;

import lab1.model.FactTable2;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FactTable2CrudRepository extends CrudRepository<FactTable2, Long> {
}
