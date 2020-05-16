package lab1.repository;

import lab1.model.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomCrudRepository extends CrudRepository<Room, Long> {
}
