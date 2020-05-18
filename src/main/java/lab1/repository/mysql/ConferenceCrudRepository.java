package lab1.repository.mysql;

import lab1.model.mysql.Conference;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConferenceCrudRepository extends CrudRepository<Conference, Long> {

    @Query(value = "SELECT COUNT(*) FROM CONFERENCE c" +
            "    WHERE EXTRACT(YEAR FROM c.CONFERENCE_DATE)=?1" +
            "    AND EXTRACT(MONTH FROM c.CONFERENCE_DATE)>=6*(?2-1)" +
            "    AND EXTRACT(MONTH FROM c.CONFERENCE_DATE)<=6*?2;",
            nativeQuery = true)
    public Double getPublicationsCount(Long year, Long term);
}
