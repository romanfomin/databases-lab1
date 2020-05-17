package lab1.model;

import javax.persistence.*;

@Entity
public class EditionType {

    @Id
    @SequenceGenerator(name = "edition_type_seq", sequenceName = "edition_type_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "edition_type_seq")
    private Long id;
    private String name;

    public EditionType() {
    }

    public EditionType(String name) {
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
