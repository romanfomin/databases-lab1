package lab1.model.mysql;

import javax.persistence.*;

@Entity
public class Position {

    @Id
    @SequenceGenerator(name = "position_seq", sequenceName = "position_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "position_seq")
    private Long id;
    private String name;

    public Position() {
    }

    public Position(String name) {
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
}
