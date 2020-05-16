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
        ControlType exam = new ControlType("exam");
        StudyForm studyForm = new StudyForm("form1");

        Subject subject1 = new Subject(10,22,12, exam);
        Subject subject2 = new Subject(12,2,5, exam);
        List<Subject> subjects = new ArrayList<>();
        subjects.add(subject1);
        subjects.add(subject2);

        Speciality speciality = new Speciality("speciality1", studyForm, subjects);
        List<Speciality> specialities = new ArrayList<>();
        specialities.add(speciality);

        Faculty faculty1 = new Faculty("ПИиКТ", specialities);
        List<Faculty> faculties = new ArrayList<>();
        faculties.add(faculty1);

        University university = new University("itmo", faculties);

        Professor professor = new Professor("name1", "lastName1", subjects);

        Student student = new Student("name1", "lastname1", speciality, 5);

        Scores scores1 = new Scores(subject1, student, 45, new Date());
        Scores scores2 = new Scores(subject2, student, 100, new Date());

        controlTypeCrudRepository.save(exam);
        studyFormCrudRepository.save(studyForm);

        subjectCrudRepository.save(subject1);
        subjectCrudRepository.save(subject2);

        specialityCrudRepository.save(speciality);
        facultyCrudRepository.save(faculty1);
        universityCrudRepository.save(university);

        professorCrudRepository.save(professor);
        studentCrudRepository.save(student);

        scoresCrudRepository.save(scores1);
        scoresCrudRepository.save(scores2);
    }
}
