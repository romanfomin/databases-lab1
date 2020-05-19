package lab1.service;

import lab1.model.awm.FactTable1;
import lab1.repository.awm.FactTable1CrudRepository;
import lab1.repository.mysql.ConferenceCrudRepository;
import lab1.repository.mysql.PublicationCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FactTable1Service {

    @Autowired
    private ConferenceCrudRepository conferenceCrudRepository;

    @Autowired
    private PublicationCrudRepository publicationCrudRepository;

    @Autowired
    private FactTable1CrudRepository factTable1CrudRepository;

    public Integer getPublicationsCount(Long year, Long term) {
        return publicationCrudRepository.getPublicationsCount(year, term);
    }

    public Integer getConferencesCount(Long year, Long term) {
        return conferenceCrudRepository.getConferencesCount(year, term);
    }

    public void save(FactTable1 entry) {
        factTable1CrudRepository.save(entry);
    }

}
