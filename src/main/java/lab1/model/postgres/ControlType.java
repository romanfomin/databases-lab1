package lab1.model.postgres;

import javax.persistence.*;

@Entity
public class ControlType {

    @Id
    @SequenceGenerator(name = "control_type_seq", sequenceName = "control_type_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "control_type_seq")
    private Long id;
    private String name;

    public ControlType() {
    }

    public ControlType(String name) {
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
