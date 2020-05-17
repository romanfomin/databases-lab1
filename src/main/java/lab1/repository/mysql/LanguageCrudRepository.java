package lab1.repository.mysql;

import lab1.model.mysql.Language;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageCrudRepository extends CrudRepository<Language, Long> {
}
