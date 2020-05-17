package lab1.repository.mongo;

import lab1.model.mongo.PersonToRoom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonToRoomCrudRepository extends CrudRepository<PersonToRoom, Long> {
}
