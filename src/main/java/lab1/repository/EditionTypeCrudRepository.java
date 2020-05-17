package lab1.repository;

import lab1.model.EditionType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditionTypeCrudRepository extends CrudRepository<EditionType, Long> {
}
