package lab1.repository.mysql;

import lab1.model.mysql.Position;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionCrudRepository extends CrudRepository<Position, Long> {
}
