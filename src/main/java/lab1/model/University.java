package lab1.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class University {

    @Id
    @SequenceGenerator(name = "university_seq", sequenceName = "university_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "university_seq")
    private Long id;
    private String name;
    @OneToMany(mappedBy = "university", fetch = FetchType.EAGER)
    private List<Faculty> faculties;

    public University() {
    }

    public University(String name) {
        this.name = name;
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

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }
}
