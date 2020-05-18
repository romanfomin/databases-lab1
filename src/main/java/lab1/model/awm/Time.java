package lab1.model.awm;

import javax.persistence.*;

@Entity
public class Time {

    @Id
    @SequenceGenerator(name = "time_seq", sequenceName = "time_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "time_seq")
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "term_id", nullable = false)
    private Term term;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "year_id", nullable = false)
    private Year year;

    public Time() {
    }

    public Time(Term term, Year year) {
        this.term = term;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Term getTerm() {
        return term;
    }

    public void setTerm(Term term) {
        this.term = term;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }
}
