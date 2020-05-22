package lab1;

import lab1.model.awm.*;
import lab1.model.mongo.*;
import lab1.model.mysql.*;
import lab1.model.postgres.*;
import lab1.repository.awm.*;
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

    @Autowired
    TermCrudRepository termCrudRepository;

    @Autowired
    YearCrudRepository yearCrudRepository;

    public void doDbOperations() {
        saveData();
        getData();
    }

    @Transactional
    public void saveData() {
// //////// Postgres ////////////////////////////////////////////////////
//        University university = new University("itmo");
//        Professor professor = new Professor("name1", "lastName1");
//
//        ControlType exam = new ControlType("exam");
//        StudyForm studyForm = new StudyForm("form1");
//
//        Subject subject1 = new Subject(10,22,12, exam, professor);
//        Subject subject2 = new Subject(12,2,5, exam, professor);
//        List<Subject> subjects = new ArrayList<>();
//        subjects.add(subject1);
//        subjects.add(subject2);
//
//        Faculty faculty1 = new Faculty("ПИиКТ", university);
//
//        Speciality speciality = new Speciality("speciality1", studyForm, subjects, faculty1);
//
//        Student student = new Student("name1", "lastname1", speciality, 5);
//
//        Scores scores1 = new Scores(subject1, student, 45, new Date());
//        Scores scores2 = new Scores(subject2, student, 100, new Date());
//
//        universityCrudRepository.save(university);
//        professorCrudRepository.save(professor);
//
//        controlTypeCrudRepository.save(exam);
//        studyFormCrudRepository.save(studyForm);
//
//        subjectCrudRepository.save(subject1);
//        subjectCrudRepository.save(subject2);
//
//        facultyCrudRepository.save(faculty1);
//        specialityCrudRepository.save(speciality);
//
//        studentCrudRepository.save(student);
//
//        scoresCrudRepository.save(scores1);
//        scoresCrudRepository.save(scores2);
<<<<<<< Updated upstream
//// //////////////////////////////////////////////////////////////////
//
//
//// //////// MYSQL ////////////////////////////////////////////////////
=======
// //////////////////////////////////////////////////////////////////


// //////// MYSQL ////////////////////////////////////////////////////
>>>>>>> Stashed changes
//        Position position = new Position("bachelor");
//        Language language = new Language("Russian");
//
//        Participant participant1 = new Participant("name1", "lastname1", position);
//        Participant participant2 = new Participant("name2", "lastname2", position);
//        List<Participant> participants = new ArrayList<>();
//        participants.add(participant1);
//        participants.add(participant2);
//
//        Conference conference = new Conference("conf1", "addr1", new Date(), participants);
//
//        EditionType editionType = new EditionType("type1");
//
//        Publication publication1 = new Publication("pub1", participants, new Date());
//        Publication publication2 = new Publication("pub2", Collections.singletonList(participant1), new Date());
//
//        Edition edition1 = new Edition("ed1", editionType, language,
//                Arrays.asList(publication1, publication2));
//        Edition edition2 = new Edition("ed2", editionType, language,
//                Collections.singletonList(publication1));
//
//        LibraryInfo libraryInfo1 = new LibraryInfo(edition1, participant1, new Date(), new Date());
//        LibraryInfo libraryInfo2 = new LibraryInfo(edition2, participant1, new Date(), new Date());
//        positionCrudRepository.save(position);
//        languageCrudRepository.save(language);
//
//        participantCrudRepository.save(participant1);
//        participantCrudRepository.save(participant2);
//
//        conferenceCrudRepository.save(conference);
//
//        editionTypeCrudRepository.save(editionType);
//
//        publicationCrudRepository.save(publication1);
//        publicationCrudRepository.save(publication2);
//
//        editionCrudRepository.save(edition1);
//        editionCrudRepository.save(edition2);
//
//        libraryInfoCrudRepository.save(libraryInfo1);
//        libraryInfoCrudRepository.save(libraryInfo2);
<<<<<<< Updated upstream
//// //////////////////////////////////////////////////////////////////
//
//// //////// Mongo ////////////////////////////////////////////////////
//        Person person1 = new Person("name1", "lastname1", false);
//        Person person2 = new Person("name2", "lastname2", true);
//
//        StudyInfo info1 = new StudyInfo("type1", 0, person1);
//        StudyInfo info2 = new StudyInfo("type2", 10000, person2);
=======
// //////////////////////////////////////////////////////////////////

// //////// Mongo ////////////////////////////////////////////////////
//        Person person1 = new Person("name1", "lastname1", false);
//        Person person2 = new Person("name2", "lastname2", true);
//
//        StudyInfo info1 = new StudyInfo("type1", 0, 3, person1);
//        StudyInfo info2 = new StudyInfo("type2", 10000, 0, person2);
>>>>>>> Stashed changes
//
//        UniversityCampus universityCampus = new UniversityCampus("addres1", 200);
//
//        Room room1 = new Room(3, false, 0, new Date(), universityCampus);
//        Room room2 = new Room(3, false, 5, new Date(), universityCampus);
//        Room room3 = new Room(4, true, 0, new Date(), universityCampus);
//
//        PersonToRoom personToRoom1 = new PersonToRoom(person1, room1, new Date(), new Date());
//        personToRoom1.setFromDate(new Date());
//        personToRoom1.setToDate(new Date());
//        PersonToRoom personToRoom2 = new PersonToRoom(person2, room1, new Date(), new Date());
//        personToRoom2.setFromDate(new Date());
//        personToRoom2.setToDate(new Date());
//
//        personCrudRepository.save(person1);
//        personCrudRepository.save(person2);
//
//        studyInfoCrudRepository.save(info1);
//        studyInfoCrudRepository.save(info2);
//
//        universityCampusCrudRepository.save(universityCampus);
//
//        roomCrudRepository.save(room1);
//        roomCrudRepository.save(room2);
//        roomCrudRepository.save(room3);
//
//
//        personToRoomCrudRepository.save(personToRoom1);
//        personToRoomCrudRepository.save(personToRoom2);
// //////////////////////////////////////////////////////////////////

// //////// AWM ////////////////////////////////////////////////////

        Campus campus1 = new Campus("Vyazemskiy pr.");
        Campus campus2 = new Campus("Moscowkiy pr.");
        Campus campus3 = new Campus("Lenina pr.");
        Campus campus4 = new Campus("Novikova st.");

        Year year1 = new Year(2020);
        Year year2 = new Year(2019);
        Year year3 = new Year(2018);
        Year year4 = new Year(2017);

        Term term1 = new Term(1);
        Term term2 = new Term(2);

        Time time1 = new Time(term1, year1);
        Time time2 = new Time(term1, year2);
        Time time3 = new Time(term1, year3);
        Time time4 = new Time(term1, year4);
        Time time5 = new Time(term2, year1);
        Time time6 = new Time(term2, year2);
        Time time7 = new Time(term2, year3);
        Time time8 = new Time(term2, year4);

        Publisher publisher1 = new Publisher("edition1", "SPB", "Russia");
        Publisher publisher2 = new Publisher("edition2", "Moscow", "Russia");

        BirthPlace birthPlace1 = new BirthPlace("distr1", "SPB", "Russia");
        BirthPlace birthPlace2 = new BirthPlace("distr2", "SPB", "Russia");

        FactTable1 factTable1_1 = new FactTable1(2, 3, 10, 5,8, 12, 23, 45, time1);
        FactTable1 factTable1_2 = new FactTable1(20, 31, 10, 5,6, 56, 5, 54, time2);
        FactTable1 factTable1_3 = new FactTable1(12, 32, 6, 5,7, 17, 65, 43, time3);
        FactTable1 factTable1_4 = new FactTable1(3, 12, 10, 5,6, 15, 12, 54, time1);
        FactTable1 factTable1_5 = new FactTable1(32, 21, 7, 65,6, 15, 5, 43, time2);
        FactTable1 factTable1_6 = new FactTable1(1, 3, 10, 5,77, 56, 1, 54, time3);
        FactTable1 factTable1_7 = new FactTable1(5, 9, 10, 5,6, 15, 5, 33, time5);
        FactTable1 factTable1_8 = new FactTable1(4, 11, 14, 10,13, 45, 13, 67, time4);
        FactTable1 factTable1_9 = new FactTable1(78, 24, 12, 12,12, 12, 12, 67, time6);
        FactTable1 factTable1_10 = new FactTable1(45, 56, 21, 14,14, 14, 14, 67, time7);
        FactTable1 factTable1_11 = new FactTable1(23, 43, 32, 23,32, 23, 32, 100, time8);

        FactTable2 factTable2_1 = new FactTable2(20, birthPlace1, time1);
        FactTable2 factTable2_2 = new FactTable2(13, birthPlace2, time1);

        FactTable3 factTable3_1 = new FactTable3(21, publisher1, time1);
        FactTable3 factTable3_2 = new FactTable3(13, publisher2, time2);

        FactTable4 factTable4_1 = new FactTable4(3.3, 13, 23, 12, 5, campus1, time1);
        FactTable4 factTable4_2 = new FactTable4(1.5, 34, 12, 32, 22, campus1, time2);
        FactTable4 factTable4_3 = new FactTable4(2.7, 23, 34, 45, 2, campus1, time3);
        FactTable4 factTable4_4 = new FactTable4(1.3, 13, 23, 12, 3, campus1, time4);
        FactTable4 factTable4_5 = new FactTable4(2.3, 13, 23, 12, 34, campus1, time5);
        FactTable4 factTable4_6 = new FactTable4(1.5, 34, 12, 32, 22, campus1, time6);
        FactTable4 factTable4_7 = new FactTable4(2.7, 23, 34, 45, 42, campus1, time7);
        FactTable4 factTable4_8 = new FactTable4(1.3, 13, 23, 12, 12, campus1, time8);
        FactTable4 factTable4_11 = new FactTable4(1.3, 13, 23, 12, 7, campus2, time1);
        FactTable4 factTable4_22 = new FactTable4(2.5, 34, 12, 32, 32, campus2, time2);
        FactTable4 factTable4_33 = new FactTable4(3.7, 23, 34, 45, 4, campus2, time3);
        FactTable4 factTable4_44 = new FactTable4(2.3, 13, 23, 12, 43, campus2, time4);
        FactTable4 factTable4_55 = new FactTable4(1.3, 13, 23, 12, 23, campus2, time5);
        FactTable4 factTable4_66 = new FactTable4(2.5, 34, 12, 32, 21, campus2, time6);
        FactTable4 factTable4_77 = new FactTable4(2.7, 23, 34, 45, 23, campus2, time7);
        FactTable4 factTable4_88 = new FactTable4(3.3, 13, 23, 12, 32, campus2, time8);
        FactTable4 factTable4_111 = new FactTable4(2.3, 13, 23, 12, 21, campus3, time1);
        FactTable4 factTable4_222 = new FactTable4(1.5, 34, 12, 32, 21, campus3, time2);
        FactTable4 factTable4_333 = new FactTable4(2.7, 23, 34, 45, 21, campus3, time3);
        FactTable4 factTable4_444 = new FactTable4(1.3, 13, 23, 12, 23, campus3, time4);
        FactTable4 factTable4_555 = new FactTable4(3.3, 13, 23, 12, 43, campus3, time5);
        FactTable4 factTable4_666 = new FactTable4(2.5, 34, 12, 32, 2, campus3, time6);
        FactTable4 factTable4_777 = new FactTable4(4.7, 23, 34, 45, 3, campus3, time7);
        FactTable4 factTable4_888 = new FactTable4(1.3, 13, 23, 12, 12, campus3, time8);
        FactTable4 factTable4_1111 = new FactTable4(4.3, 13, 23, 12, 8, campus4, time1);
        FactTable4 factTable4_2222 = new FactTable4(3.5, 34, 12, 32, 1, campus4, time2);
        FactTable4 factTable4_3333 = new FactTable4(1.7, 23, 34, 45, 43, campus4, time3);
        FactTable4 factTable4_4444 = new FactTable4(3.3, 13, 23, 12, 5, campus4, time4);
        FactTable4 factTable4_5555 = new FactTable4(2.3, 13, 23, 12, 43, campus4, time5);
        FactTable4 factTable4_6666 = new FactTable4(1.5, 34, 12, 32, 34, campus4, time6);
        FactTable4 factTable4_7777 = new FactTable4(4.7, 23, 34, 45, 32, campus4, time7);
        FactTable4 factTable4_8888 = new FactTable4(2.3, 13, 23, 12, 7, campus4, time8);


        campusCrudRepository.save(campus1);
        campusCrudRepository.save(campus2);
        campusCrudRepository.save(campus3);
        campusCrudRepository.save(campus4);

        yearCrudRepository.save(year1);
        yearCrudRepository.save(year2);
        yearCrudRepository.save(year3);
        yearCrudRepository.save(year4);

        termCrudRepository.save(term1);
        termCrudRepository.save(term2);

        timeCrudRepository.save(time1);
        timeCrudRepository.save(time2);
        timeCrudRepository.save(time3);
        timeCrudRepository.save(time4);
        timeCrudRepository.save(time5);
        timeCrudRepository.save(time6);
        timeCrudRepository.save(time7);
        timeCrudRepository.save(time8);

        publisherCrudRepository.save(publisher1);
        publisherCrudRepository.save(publisher2);

        birthPlaceCrudRepository.save(birthPlace1);
        birthPlaceCrudRepository.save(birthPlace2);

        factTable1CrudRepository.save(factTable1_1);
        factTable1CrudRepository.save(factTable1_2);
        factTable1CrudRepository.save(factTable1_3);
        factTable1CrudRepository.save(factTable1_4);
        factTable1CrudRepository.save(factTable1_5);
        factTable1CrudRepository.save(factTable1_6);
        factTable1CrudRepository.save(factTable1_7);
        factTable1CrudRepository.save(factTable1_8);
        factTable1CrudRepository.save(factTable1_9);
        factTable1CrudRepository.save(factTable1_10);
        factTable1CrudRepository.save(factTable1_11);

        factTable2CrudRepository.save(factTable2_1);
        factTable2CrudRepository.save(factTable2_2);

        factTable3CrudRepository.save(factTable3_1);
        factTable3CrudRepository.save(factTable3_2);

        factTable4CrudRepository.save(factTable4_1);
        factTable4CrudRepository.save(factTable4_2);
        factTable4CrudRepository.save(factTable4_3);
        factTable4CrudRepository.save(factTable4_4);
        factTable4CrudRepository.save(factTable4_5);
        factTable4CrudRepository.save(factTable4_6);
        factTable4CrudRepository.save(factTable4_7);
        factTable4CrudRepository.save(factTable4_8);
        factTable4CrudRepository.save(factTable4_11);
        factTable4CrudRepository.save(factTable4_22);
        factTable4CrudRepository.save(factTable4_33);
        factTable4CrudRepository.save(factTable4_44);
        factTable4CrudRepository.save(factTable4_55);
        factTable4CrudRepository.save(factTable4_66);
        factTable4CrudRepository.save(factTable4_77);
        factTable4CrudRepository.save(factTable4_88);
        factTable4CrudRepository.save(factTable4_111);
        factTable4CrudRepository.save(factTable4_222);
        factTable4CrudRepository.save(factTable4_333);
        factTable4CrudRepository.save(factTable4_444);
        factTable4CrudRepository.save(factTable4_555);
        factTable4CrudRepository.save(factTable4_666);
        factTable4CrudRepository.save(factTable4_777);
        factTable4CrudRepository.save(factTable4_888);
        factTable4CrudRepository.save(factTable4_1111);
        factTable4CrudRepository.save(factTable4_2222);
        factTable4CrudRepository.save(factTable4_3333);
        factTable4CrudRepository.save(factTable4_4444);
        factTable4CrudRepository.save(factTable4_5555);
        factTable4CrudRepository.save(factTable4_6666);
        factTable4CrudRepository.save(factTable4_7777);
        factTable4CrudRepository.save(factTable4_8888);
// //////////////////////////////////////////////////////////////////
    }

    @Transactional
    public void getData() {

    }
}
