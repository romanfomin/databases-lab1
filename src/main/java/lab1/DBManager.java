package lab1;

import lab1.model.*;
import lab1.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class DBManager {

    @Autowired
    BirthPlaceCrudRepository birthPlaceCrudRepository;

    @Autowired
    CampusCrudRepository campusCrudRepository;

    @Autowired
    PublisherCrudRepository publisherCrudRepository;

    @Autowired
    TimeCrudRepository timeCrudRepository;

    @Autowired
    FactTable1CrudRepository factTable1CrudRepository;

    @Autowired
    FactTable2CrudRepository factTable2CrudRepository;

    @Autowired
    FactTable3CrudRepository factTable3CrudRepository;

    @Autowired
    FactTable4CrudRepository factTable4CrudRepository;

    public void doDbOperations() {
        saveData();
        getData();
    }

    @Transactional
    public void saveData() {
        Campus campus1 = new Campus("address1");
        Campus campus2 = new Campus("address2");

        Time time1 = new Time(1, 2020);
        Time time2 = new Time(2, 2020);

        Publisher publisher1 = new Publisher("edition1", "SPB", "Russia");
        Publisher publisher2 = new Publisher("edition2", "Moscow", "Russia");

        BirthPlace birthPlace1 = new BirthPlace("distr1", "SPB", "Russia");
        BirthPlace birthPlace2 = new BirthPlace("distr2", "SPB", "Russia");

        FactTable1 factTable1_1 = new FactTable1(2, 3, 10, 5,
                8, 12, 23, 45, time1);
        FactTable1 factTable1_2 = new FactTable1(20, 31, 10, 5,
                6, 15, 5, 54, time2);

        FactTable2 factTable2_1 = new FactTable2(20, birthPlace1, time1);
        FactTable2 factTable2_2 = new FactTable2(13, birthPlace2, time1);

        FactTable3 factTable3_1 = new FactTable3(21, publisher1, time1);
        FactTable3 factTable3_2 = new FactTable3(13, publisher2, time2);

        FactTable4 factTable4_1 = new FactTable4(2.3, 13, 23, 12, 3, campus1, time1);
        FactTable4 factTable4_2 = new FactTable4(2.5, 34, 12, 32, 21, campus2, time2);

        campusCrudRepository.save(campus1);
        campusCrudRepository.save(campus2);

        timeCrudRepository.save(time1);
        timeCrudRepository.save(time2);

        publisherCrudRepository.save(publisher1);
        publisherCrudRepository.save(publisher2);

        birthPlaceCrudRepository.save(birthPlace1);
        birthPlaceCrudRepository.save(birthPlace2);

        factTable1CrudRepository.save(factTable1_1);
        factTable1CrudRepository.save(factTable1_2);

        factTable2CrudRepository.save(factTable2_1);
        factTable2CrudRepository.save(factTable2_2);

        factTable3CrudRepository.save(factTable3_1);
        factTable3CrudRepository.save(factTable3_2);

        factTable4CrudRepository.save(factTable4_1);
        factTable4CrudRepository.save(factTable4_2);
    }

    @Transactional
    public void getData() {
        Iterable<FactTable1> factTable1s = factTable1CrudRepository.findAll();
        Iterable<FactTable2> factTable2s = factTable2CrudRepository.findAll();

        System.out.println("end");
    }
}
