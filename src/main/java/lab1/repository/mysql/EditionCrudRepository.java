package lab1.repository.mysql;

import lab1.model.mysql.Edition;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditionCrudRepository extends CrudRepository<Edition, Long> {
}
