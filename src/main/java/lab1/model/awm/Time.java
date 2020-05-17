package lab1.model.awm;

import javax.persistence.*;

@Entity
public class Time {

    @Id
    @SequenceGenerator(name = "time_seq", sequenceName = "time_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "time_seq")
    private Long id;
    private Integer term;
    private Integer year;

    public Time() {
    }

    public Time(Integer term, Integer year) {
        this.term = term;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
