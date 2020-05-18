package lab1;

import lab1.model.awm.Campus;
import lab1.model.mongo.*;
import lab1.model.mysql.*;
import lab1.model.postgres.*;
import lab1.repository.awm.CampusCrudRepository;
import lab1.repository.mongo.*;
import lab1.repository.mysql.*;
import lab1.repository.postgres.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Component
public class DBManager {

    @Autowired
    ConferenceCrudRepository conferenceCrudRepository;

    @Autowired
    EditionCrudRepository editionCrudRepository;

    @Autowired
    EditionTypeCrudRepository editionTypeCrudRepository;

    @Autowired
    LanguageCrudRepository languageCrudRepository;

    @Autowired
    LibraryInfoCrudRepository libraryInfoCrudRepository;

    @Autowired
    ParticipantCrudRepository participantCrudRepository;

    @Autowired
    PositionCrudRepository positionCrudRepository;

    @Autowired
    PublicationCrudRepository publicationCrudRepository;

    @Autowired
    ControlTypeCrudRepository controlTypeCrudRepository;

    @Autowired
    FacultyCrudRepository facultyCrudRepository;

    @Autowired
    ProfessorCrudRepository professorCrudRepository;

    @Autowired
    ScoresCrudRepository scoresCrudRepository;

    @Autowired
    SpecialityCrudRepository specialityCrudRepository;

    @Autowired
    StudentCrudRepository studentCrudRepository;

    @Autowired
    StudyFormCrudRepository studyFormCrudRepository;

    @Autowired
    SubjectCrudRepository subjectCrudRepository;

    @Autowired
    UniversityCrudRepository universityCrudRepository;

    @Autowired
    PersonCrudRepository personCrudRepository;

    @Autowired
    UniversityCampusCrudRepository universityCampusCrudRepository;

    @Autowired
    RoomCrudRepository roomCrudRepository;

    @Autowired
    StudyInfoCrudRepository studyInfoCrudRepository;

    @Autowired
    PersonToRoomCrudRepository personToRoomCrudRepository;

    public void doDbOperations() {
        saveData();
        getData();
    }

    @Transactional
    public void saveData() {
// //////// Postgres ////////////////////////////////////////////////////
        University university = new University("itmo");
        Professor professor = new Professor("name1", "lastName1");

        ControlType exam = new ControlType("exam");
        StudyForm studyForm = new StudyForm("form1");

        Subject subject1 = new Subject(10,22,12, exam, professor);
        Subject subject2 = new Subject(12,2,5, exam, professor);
        List<Subject> subjects = new ArrayList<>();
        subjects.add(subject1);
        subjects.add(subject2);

        Faculty faculty1 = new Faculty("ПИиКТ", university);

        Speciality speciality = new Speciality("speciality1", studyForm, subjects, faculty1);

        Student student = new Student("name1", "lastname1", speciality, 5);

        Scores scores1 = new Scores(subject1, student, 45, new Date());
        Scores scores2 = new Scores(subject2, student, 100, new Date());

        universityCrudRepository.save(university);
        professorCrudRepository.save(professor);

        controlTypeCrudRepository.save(exam);
        studyFormCrudRepository.save(studyForm);

        subjectCrudRepository.save(subject1);
        subjectCrudRepository.save(subject2);

        facultyCrudRepository.save(faculty1);
        specialityCrudRepository.save(speciality);

        studentCrudRepository.save(student);

        scoresCrudRepository.save(scores1);
        scoresCrudRepository.save(scores2);
// //////////////////////////////////////////////////////////////////


// //////// MYSQL ////////////////////////////////////////////////////
        Position position = new Position("bachelor");
        Language language = new Language("Russian");

        Participant participant1 = new Participant("name1", "lastname1", position);
        Participant participant2 = new Participant("name2", "lastname2", position);
        List<Participant> participants = new ArrayList<>();
        participants.add(participant1);
        participants.add(participant2);

        Conference conference = new Conference("conf1", "addr1", new Date(), participants);

        EditionType editionType = new EditionType("type1");

        Publication publication1 = new Publication("pub1", participants, new Date());
        Publication publication2 = new Publication("pub2", Collections.singletonList(participant1), new Date());

        Edition edition1 = new Edition("ed1", editionType, language,
                Arrays.asList(publication1, publication2));
        Edition edition2 = new Edition("ed2", editionType, language,
                Collections.singletonList(publication1));

        LibraryInfo libraryInfo1 = new LibraryInfo(edition1, participant1, new Date(), new Date());
        LibraryInfo libraryInfo2 = new LibraryInfo(edition2, participant1, new Date(), new Date());
        positionCrudRepository.save(position);
        languageCrudRepository.save(language);

        participantCrudRepository.save(participant1);
        participantCrudRepository.save(participant2);

        conferenceCrudRepository.save(conference);

        editionTypeCrudRepository.save(editionType);

        publicationCrudRepository.save(publication1);
        publicationCrudRepository.save(publication2);

        editionCrudRepository.save(edition1);
        editionCrudRepository.save(edition2);

        libraryInfoCrudRepository.save(libraryInfo1);
        libraryInfoCrudRepository.save(libraryInfo2);
// //////////////////////////////////////////////////////////////////

// //////// Mongo ////////////////////////////////////////////////////
        Person person1 = new Person("name1", "lastname1", false);
        Person person2 = new Person("name2", "lastname2", true);

        StudyInfo info1 = new StudyInfo("type1", 0, person1);
        StudyInfo info2 = new StudyInfo("type2", 10000, person2);

        UniversityCampus universityCampus = new UniversityCampus("addres1", 200);

        Room room1 = new Room(3, false, 0, new Date(), universityCampus);
        Room room2 = new Room(3, false, 5, new Date(), universityCampus);
        Room room3 = new Room(4, true, 0, new Date(), universityCampus);

        PersonToRoom personToRoom1 = new PersonToRoom(person1, room1, new Date(), new Date());
        personToRoom1.setFromDate(new Date());
        personToRoom1.setToDate(new Date());
        PersonToRoom personToRoom2 = new PersonToRoom(person2, room1, new Date(), new Date());
        personToRoom2.setFromDate(new Date());
        personToRoom2.setToDate(new Date());

        personCrudRepository.save(person1);
        personCrudRepository.save(person2);

        studyInfoCrudRepository.save(info1);
        studyInfoCrudRepository.save(info2);

        universityCampusCrudRepository.save(universityCampus);

        roomCrudRepository.save(room1);
        roomCrudRepository.save(room2);
        roomCrudRepository.save(room3);


        personToRoomCrudRepository.save(personToRoom1);
        personToRoomCrudRepository.save(personToRoom2);
// //////////////////////////////////////////////////////////////////
    }

    @Transactional
    public void getData() {

    }
}
