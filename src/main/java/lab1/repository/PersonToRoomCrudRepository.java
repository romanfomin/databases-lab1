package lab1.repository;

import lab1.model.PersonToRoom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonToRoomCrudRepository extends CrudRepository<PersonToRoom, Long> {
}
