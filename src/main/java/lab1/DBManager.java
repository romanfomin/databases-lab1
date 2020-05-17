package lab1;

import lab1.model.*;
import lab1.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class DBManager {

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

    public void doDbOperations() {
        saveData();
        getData();
    }

    @Transactional
    public void saveData() {
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
    }

    @Transactional
    public void getData() {
        Iterable<University> universities = universityCrudRepository.findAll();
        Iterable<Scores> scores = scoresCrudRepository.findAll();
        Iterable<Student> students = studentCrudRepository.findAll();
    }
}
