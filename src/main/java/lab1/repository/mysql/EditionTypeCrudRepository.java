package lab1.repository.mysql;

import lab1.model.mysql.EditionType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditionTypeCrudRepository extends CrudRepository<EditionType, Long> {
}
