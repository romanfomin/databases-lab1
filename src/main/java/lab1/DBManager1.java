package lab1;

import lab1.model.awm.FactTable1;
import lab1.model.awm.Time;
import lab1.repository.awm.TimeCrudRepository;
import lab1.repository.mysql.ConferenceCrudRepository;
import lab1.repository.mysql.PublicationCrudRepository;
import lab1.service.FactTable1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class DBManager1 {

    @Autowired
    ConferenceCrudRepository conferenceCrudRepository;

    @Autowired
    PublicationCrudRepository publicationCrudRepository;

    @Autowired
    TimeCrudRepository timeCrudRepository;

    @Autowired
    private FactTable1Service factTable1Service;

    @Transactional
    public void fillFactTable1() {
        for (long year = 2015; year <= 2020; year++) {
            for (long term = 0; term <= 1; term++) {
                Time time = new Time(term, year);
                timeCrudRepository.save(time);

                Integer conferencesCount = conferenceCrudRepository.getConferencesCount(year, term);
                Integer publicationsCount = publicationCrudRepository.getPublicationsCount(year, term);

                FactTable1 entry = new FactTable1();
                entry.setConferences(conferencesCount);
                entry.setPublications(publicationsCount);
                factTable1Service.save(entry);
            }
        }
    }
}
