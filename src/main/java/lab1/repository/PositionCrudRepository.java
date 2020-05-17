package lab1.repository;

import lab1.model.Position;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionCrudRepository extends CrudRepository<Position, Long> {
}
