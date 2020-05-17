package lab1.repository.awm;

import lab1.model.awm.BirthPlace;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BirthPlaceCrudRepository extends CrudRepository<BirthPlace, Long> {
}
