package lab1;

import lab1.model.*;
import lab1.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class DBManager {

    @Autowired
    PersonCrudRepository personCrudRepository;

    @Autowired
    CampusCrudRepository campusCrudRepository;

    @Autowired
    RoomCrudRepository roomCrudRepository;

    @Autowired
    StudyInfoCrudRepository studyInfoCrudRepository;

    @Autowired
    PersonToRoomCrudRepository personToRoomCrudRepository;

    public void doDbOperations() {
        Person person1 = new Person("name1", "lastname1");
        Person person2 = new Person("name2", "lastname2");

        StudyInfo info1 = new StudyInfo("type1", 0, person1);
        StudyInfo info2 = new StudyInfo("type2", 10000, person2);

        Room room1 = new Room(3);
        Room room2 = new Room(4);
        Room room3 = new Room(4);

        Campus campus = new Campus("addres1", 200);
        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        campus.setRooms(rooms);

        PersonToRoom personToRoom1 = new PersonToRoom(person1, room1);
        personToRoom1.setFrom(new Date());
        personToRoom1.setTo(new Date());
        PersonToRoom personToRoom2 = new PersonToRoom(person2, room1);
        personToRoom2.setFrom(new Date());
        personToRoom2.setTo(new Date());

        personCrudRepository.save(person1);
        personCrudRepository.save(person2);

        studyInfoCrudRepository.save(info1);
        studyInfoCrudRepository.save(info2);

        roomCrudRepository.save(room1);
        roomCrudRepository.save(room2);
        roomCrudRepository.save(room3);

        campusCrudRepository.save(campus);

        personToRoomCrudRepository.save(personToRoom1);
        personToRoomCrudRepository.save(personToRoom2);
    }
}
