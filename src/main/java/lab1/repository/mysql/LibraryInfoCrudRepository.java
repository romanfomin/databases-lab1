package lab1.repository.mysql;

import lab1.model.mysql.LibraryInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryInfoCrudRepository extends CrudRepository<LibraryInfo, Long> {
}
