package lab1.model;

import org.springframework.data.annotation.Id;

public class StudyInfo {

    @Id
    private String id;
    private String type;
    private Integer paid;
    private Person person;

    public StudyInfo(String type, Integer paid, Person person) {
        this.type = type;
        this.paid = paid;
        this.person = person;
    }

    public String getId() {
        return id;
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
