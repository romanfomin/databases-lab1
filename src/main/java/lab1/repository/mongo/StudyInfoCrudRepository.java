package lab1.repository.mongo;

import lab1.model.mongo.StudyInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudyInfoCrudRepository extends CrudRepository<StudyInfo, Long> {
}
