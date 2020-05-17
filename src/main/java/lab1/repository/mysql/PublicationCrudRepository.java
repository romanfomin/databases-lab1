package lab1.repository.mysql;

import lab1.model.mysql.Publication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicationCrudRepository extends CrudRepository<Publication, Long> {
}
