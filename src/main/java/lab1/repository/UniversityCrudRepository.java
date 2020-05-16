package lab1.repository;

import lab1.model.University;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversityCrudRepository extends CrudRepository<University, Long> {
}
