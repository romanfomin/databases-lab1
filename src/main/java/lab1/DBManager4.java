package lab1;

import lab1.model.awm.*;
import lab1.model.mongo.*;
import lab1.model.mysql.*;
import lab1.model.postgres.*;
import lab1.repository.awm.*;
import lab1.repository.mongo.*;
import lab1.repository.mysql.*;
import lab1.repository.postgres.*;
import lab1.service.FactTable4Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Component
public class DBManager4 {

    @Autowired
    UniversityCampusCrudRepository universityCampusCrudRepository;

    @Autowired
    CampusCrudRepository campusCrudRepository;

    @Autowired
    private FactTable4Service factTable4Service;

    @Transactional
    public void fillFactTable4() {
        Iterable<UniversityCampus> universityCampuses = universityCampusCrudRepository.findAll();
        for (UniversityCampus universityCampus: universityCampuses) {
            Double avgPeopleInOneRoom = factTable4Service.getAvgPeopleInOneRoom(universityCampus.getId());
            Integer studentsWithDebtsCount = factTable4Service.getStudentsWithDebtsCount(universityCampus.getId());

            Campus campus = new Campus(universityCampus.getAddress());
            campusCrudRepository.save(campus);

            FactTable4 factTable4Entry = new FactTable4();
            factTable4Entry.setAvgPeopleInOneRoom(avgPeopleInOneRoom);
            factTable4Entry.setStudentsWithDebts(studentsWithDebtsCount);
            factTable4Entry.setCampus(campus);
            factTable4Service.save(factTable4Entry);
        }
    }
}
