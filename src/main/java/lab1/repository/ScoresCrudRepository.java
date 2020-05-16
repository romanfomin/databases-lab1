package lab1.repository;

import lab1.model.Scores;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoresCrudRepository extends CrudRepository<Scores, Long> {
}
