package lab1.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Scores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Subject subject;
    private Student student;
    private Integer score;
    private Date date;

    public Scores(Subject subject, Student student, Integer score, Date date) {
        this.subject = subject;
        this.student = student;
        this.score = score;
        this.date = date;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
