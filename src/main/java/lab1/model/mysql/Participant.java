package lab1.model.mysql;

import javax.persistence.*;

@Entity
public class Participant {

    @Id
    @SequenceGenerator(name = "participant_seq", sequenceName = "participant_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "participant_seq")
    private Long id;
    private String name;
    private String lastName;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "position_id", nullable = false)
    private Position position;

    public Participant() {
    }

    public Participant(String name, String lastName, Position position) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
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

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
