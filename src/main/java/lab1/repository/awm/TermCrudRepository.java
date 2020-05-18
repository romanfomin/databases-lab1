package lab1.repository.awm;

import lab1.model.awm.Term;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TermCrudRepository extends CrudRepository<Term, Long> {
}
