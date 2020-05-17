package lab1.repository;

import lab1.model.Edition;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditionCrudRepository extends CrudRepository<Edition, Long> {
}
