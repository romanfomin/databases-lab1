package lab1.repository;

import lab1.model.StudyInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudyInfoCrudRepository extends CrudRepository<StudyInfo, Long> {
}
