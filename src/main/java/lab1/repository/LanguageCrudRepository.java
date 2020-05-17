package lab1.repository;

import lab1.model.Language;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageCrudRepository extends CrudRepository<Language, Long> {
}
