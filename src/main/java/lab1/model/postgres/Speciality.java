package lab1.model.postgres;

import javax.persistence.*;
import java.util.List;

@Entity
public class Speciality {

    @Id
    @SequenceGenerator(name = "speciality_seq", sequenceName = "speciality_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "speciality_seq")
    private Long id;
    private String name;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "study_form_id", nullable = false)
    private StudyForm studyForm;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "subject_to_speciality",
            joinColumns = @JoinColumn(name = "speciality_id"),
            inverseJoinColumns = @JoinColumn(name = "subject_id")
    )
    private List<Subject> subjects;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "faculty_id", nullable = false)
    private Faculty faculty;

    public Speciality() {
    }

    public Speciality(String name, StudyForm studyForm, List<Subject> subjects, Faculty faculty) {
        this.name = name;
        this.studyForm = studyForm;
        this.subjects = subjects;
        this.faculty = faculty;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudyForm getStudyForm() {
        return studyForm;
    }

    public void setStudyForm(StudyForm studyForm) {
        this.studyForm = studyForm;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
}
