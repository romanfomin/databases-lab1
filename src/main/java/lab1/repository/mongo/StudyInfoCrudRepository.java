package lab1.repository.mongo;

import lab1.model.mongo.StudyInfo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudyInfoCrudRepository extends CrudRepository<StudyInfo, Long> {

    @Query(value = "SELECT COUNT(*) FROM STUDY_INFO si" +
            "    JOIN PERSON_TO_ROOM ptr ON si.PERSON_ID=ptr.PERSON_ID" +
            "    JOIN ROOM R on ptr.ROOM_ID = R.ID" +
            "    JOIN UNIVERSITY_CAMPUS UC on R.UNIVERSITY_CAMPUS_ID = UC.ID" +
            "    WHERE uc.ID = ?1 AND si.DEBT > 0;",
            nativeQuery = true)
    public Integer getStudentsWithDebtsCount(Long campusId);
}
