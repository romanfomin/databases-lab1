package lab1.repository.mongo;

import lab1.model.mongo.UniversityCampus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversityCampusCrudRepository extends CrudRepository<UniversityCampus, Long> {
}
