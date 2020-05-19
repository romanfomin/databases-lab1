package lab1.service;

import lab1.model.awm.FactTable4;
import lab1.repository.awm.FactTable4CrudRepository;
import lab1.repository.mongo.PersonToRoomCrudRepository;
import lab1.repository.mongo.StudyInfoCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FactTable4Service {

    @Autowired
    private StudyInfoCrudRepository studyInfoCrudRepository;

    @Autowired
    private PersonToRoomCrudRepository personToRoomCrudRepository;

    @Autowired
    private FactTable4CrudRepository factTable4CrudRepository;

    public Integer getStudentsWithDebtsCount(Long campusId) {
        return studyInfoCrudRepository.getStudentsWithDebtsCount(campusId);
    }

    public Double getAvgPeopleInOneRoom(Long campusId) {
        return personToRoomCrudRepository.getAvgPeopleInOneRoom(campusId);
    }

    public void save(FactTable4 entry) {
        factTable4CrudRepository.save(entry);
    }

}
