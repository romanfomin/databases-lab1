package lab1.repository;

import lab1.model.Participant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipantCrudRepository extends CrudRepository<Participant, Long> {
}
