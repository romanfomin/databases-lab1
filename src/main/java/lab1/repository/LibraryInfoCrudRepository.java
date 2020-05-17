package lab1.repository;

import lab1.model.LibraryInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryInfoCrudRepository extends CrudRepository<LibraryInfo, Long> {
}
