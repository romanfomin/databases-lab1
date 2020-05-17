package lab1.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Professor {

    @Id
    @SequenceGenerator(name = "professor_seq", sequenceName = "professor_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "professor_seq")
    private Long id;
    private String name;
    private String lastName;
    @OneToMany(mappedBy = "professor", fetch = FetchType.EAGER)
    private List<Subject> subjects;

    public Professor() {
    }

    public Professor(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}
