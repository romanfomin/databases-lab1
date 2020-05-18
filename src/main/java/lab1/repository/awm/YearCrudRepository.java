package lab1.repository.awm;

import lab1.model.awm.Year;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YearCrudRepository extends CrudRepository<Year, Long> {
}
