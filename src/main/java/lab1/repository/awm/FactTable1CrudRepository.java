package lab1.repository.awm;

import lab1.model.awm.FactTable1;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FactTable1CrudRepository extends CrudRepository<FactTable1, Long> {
}
