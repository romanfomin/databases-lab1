package lab1.repository;

import lab1.model.Speciality;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialityCrudRepository extends CrudRepository<Speciality, Long> {
}
