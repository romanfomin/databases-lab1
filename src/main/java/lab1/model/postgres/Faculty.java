package lab1.model.postgres;

import javax.persistence.*;
import java.util.List;

@Entity
public class Faculty {

    @Id
    @SequenceGenerator(name = "faculty_seq", sequenceName = "faculty_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "faculty_seq")
    private Long id;
    private String name;
    @OneToMany(mappedBy = "faculty", fetch = FetchType.EAGER)
    private List<Speciality> specialities;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "university_id", nullable = false)
    private University university;

    public Faculty() {
    }

    public Faculty(String name, University university) {
        this.name = name;
        this.university = university;
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

    public List<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(List<Speciality> specialities) {
        this.specialities = specialities;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }
}
