package lab1.repository.postgres;

import lab1.model.postgres.Speciality;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialityCrudRepository extends CrudRepository<Speciality, Long> {
}
