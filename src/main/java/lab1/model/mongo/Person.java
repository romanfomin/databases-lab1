package lab1.model.mongo;

import javax.persistence.*;

@Entity
public class Person {

    @Id
    @SequenceGenerator(name = "person_seq", sequenceName = "person_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_seq")
    private Long id;
    private String firstName;
    private String lastName;
    private boolean privileges;

    public Person() {
    }

    public Person(String firstName, String lastName, boolean privileges) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.privileges = privileges;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isPrivileges() {
        return privileges;
    }

    public void setPrivileges(boolean privileges) {
        this.privileges = privileges;
    }
}
