package lab1.repository.mysql;

import lab1.model.mysql.Participant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipantCrudRepository extends CrudRepository<Participant, Long> {
}
