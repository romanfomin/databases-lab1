package lab1.repository.awm;

import lab1.model.awm.Publisher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherCrudRepository extends CrudRepository<Publisher, Long> {
}
