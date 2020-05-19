package lab1.repository.mysql;

import lab1.model.mysql.Publication;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicationCrudRepository extends CrudRepository<Publication, Long> {

    @Query(value = "SELECT COUNT(*) FROM PUBLICATION p" +
            "    WHERE EXTRACT(YEAR FROM p.PUBLICATION_DATE)=?1" +
            "    AND EXTRACT(MONTH FROM p.PUBLICATION_DATE)>=6*(?2-1)" +
            "    AND EXTRACT(MONTH FROM p.PUBLICATION_DATE)<=6*?2;",
            nativeQuery = true)
    public Integer getPublicationsCount(Long year, Long term);
}
