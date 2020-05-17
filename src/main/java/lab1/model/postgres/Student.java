package lab1.model.postgres;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    @SequenceGenerator(name = "student_seq", sequenceName = "student_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_seq")
    private Long id;
    private String name;
    private String lastName;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "speciality_id", nullable = false)
    private Speciality speciality;
    private Integer semester;

    public Student() {
    }

    public Student(String name, String lastName, Speciality speciality, Integer semester) {
        this.name = name;
        this.lastName = lastName;
        this.speciality = speciality;
        this.semester = semester;
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

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }
}
