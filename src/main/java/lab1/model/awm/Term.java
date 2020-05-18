package lab1.model.awm;

import javax.persistence.*;

@Entity
public class Term {

    @Id
    @SequenceGenerator(name = "term_seq", sequenceName = "term_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "term_seq")
    private Long id;
    private Integer value;

    public Term() {
    }

    public Term(Integer value) {
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
