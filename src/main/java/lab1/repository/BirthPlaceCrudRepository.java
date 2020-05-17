package lab1.repository;

import lab1.model.BirthPlace;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BirthPlaceCrudRepository extends CrudRepository<BirthPlace, Long> {
}
