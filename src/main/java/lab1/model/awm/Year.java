package lab1.model.awm;

import javax.persistence.*;

@Entity
public class Year {

    @Id
    @SequenceGenerator(name = "year_seq", sequenceName = "year_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "year_seq")
    private Long id;
    private Integer value;

    public Year() {
    }

    public Year(Integer value) {
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
