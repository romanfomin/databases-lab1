package lab1.repository.postgres;

import lab1.model.postgres.StudyForm;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudyFormCrudRepository extends CrudRepository<StudyForm, Long> {
}
