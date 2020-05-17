package lab1.repository;

import lab1.model.Publisher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherCrudRepository extends CrudRepository<Publisher, Long> {
}
