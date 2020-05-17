package lab1.repository;

import lab1.model.Publication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicationCrudRepository extends CrudRepository<Publication, Long> {
}
