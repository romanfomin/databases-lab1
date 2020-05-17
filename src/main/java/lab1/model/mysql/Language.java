package lab1.model.mysql;

import javax.persistence.*;

@Entity
public class Language {

    @Id
    @SequenceGenerator(name = "language_seq", sequenceName = "language_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "language_seq")
    private Long id;
    private String name;

    public Language() {
    }

    public Language(String name) {
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
