package lab1.repository.mongo;

import lab1.model.mongo.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomCrudRepository extends CrudRepository<Room, Long> {
}
