package lab1.repository.mongo;

import lab1.model.mongo.PersonToRoom;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonToRoomCrudRepository extends CrudRepository<PersonToRoom, Long> {

    @Query(value = "SELECT AVG(tbl.count) FROM (" +
            "         SELECT COUNT(ptr.PERSON_ID) count, r.ID" +
            "         FROM ROOM r" +
            "                  LEFT JOIN PERSON_TO_ROOM ptr ON ptr.ROOM_ID = r.ID" +
            "                  LEFT JOIN UNIVERSITY_CAMPUS uc ON r.UNIVERSITY_CAMPUS_ID = uc.ID" +
            "         WHERE uc.id = ?1" +
            "         GROUP BY r.ID) tbl",
    nativeQuery = true)
    public Double getAvgPeopleInOneRoom(Long campusId);
}
