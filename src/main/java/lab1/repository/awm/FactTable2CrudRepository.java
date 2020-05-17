package lab1.repository.awm;

import lab1.model.awm.FactTable2;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FactTable2CrudRepository extends CrudRepository<FactTable2, Long> {
}
