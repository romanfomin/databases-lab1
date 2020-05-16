package lab1.repository;

import lab1.model.StudyForm;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudyFormCrudRepository extends CrudRepository<StudyForm, Long> {
}
