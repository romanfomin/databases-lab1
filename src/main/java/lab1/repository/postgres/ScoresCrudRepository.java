package lab1.repository.postgres;

import lab1.model.postgres.Scores;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoresCrudRepository extends CrudRepository<Scores, Long> {
}
