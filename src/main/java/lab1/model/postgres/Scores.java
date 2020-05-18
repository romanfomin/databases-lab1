package lab1.model.postgres;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Scores {

    @Id
    @SequenceGenerator(name = "scores_seq", sequenceName = "scores_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "scores_seq")
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "subject_id", nullable = false)
    private Subject subject;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;
    private Integer score;
    private Date setDate;

    public Scores() {
    }

    public Scores(Subject subject, Student student, Integer score, Date setDate) {
        this.subject = subject;
        this.student = student;
        this.score = score;
        this.setDate = setDate;
    }

    public Long getId() {
        return id;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Date getSetDate() {
        return setDate;
    }

    public void setSetDate(Date setDate) {
        this.setDate = setDate;
    }
}
