package lab1.repository.awm;

import lab1.model.awm.FactTable3;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FactTable3CrudRepository extends CrudRepository<FactTable3, Long> {
}