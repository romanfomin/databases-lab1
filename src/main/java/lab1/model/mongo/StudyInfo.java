package lab1.model.mongo;

import javax.persistence.*;

@Entity
public class StudyInfo {

    @Id
    @SequenceGenerator(name = "study_info_seq", sequenceName = "study_info_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "study_info_seq")
    private Long id;
    private String type;
    private Integer paid;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    public StudyInfo() {
    }

    public StudyInfo(String type, Integer paid, Person person) {
        this.type = type;
        this.paid = paid;
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPaid() {
        return paid;
    }

    public void setPaid(Integer paid) {
        this.paid = paid;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
