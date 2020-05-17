package lab1.model;

import javax.persistence.*;

@Entity
public class Subject {

    @Id
    @SequenceGenerator(name = "subject_seq", sequenceName = "subject_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "subject_seq")
    private Long id;
    private Integer lectureHours;
    private Integer practiceHours;
    private Integer labHours;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "control_type_id", nullable = false)
    private ControlType controlType;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "professor_id", nullable = false)
    private Professor professor;

    public Subject() {
    }

    public Subject(Integer lectureHours, Integer practiceHours, Integer labHours, ControlType controlType, Professor professor) {
        this.lectureHours = lectureHours;
        this.practiceHours = practiceHours;
        this.labHours = labHours;
        this.controlType = controlType;
        this.professor = professor;
    }

    public Long getId() {
        return id;
    }

    public Integer getLectureHours() {
        return lectureHours;
    }

    public void setLectureHours(Integer lectureHours) {
        this.lectureHours = lectureHours;
    }

    public Integer getPracticeHours() {
        return practiceHours;
    }

    public void setPracticeHours(Integer practiceHours) {
        this.practiceHours = practiceHours;
    }

    public Integer getLabHours() {
        return labHours;
    }

    public void setLabHours(Integer labHours) {
        this.labHours = labHours;
    }

    public ControlType getControlType() {
        return controlType;
    }

    public void setControlType(ControlType controlType) {
        this.controlType = controlType;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
