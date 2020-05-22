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

    private Integer termValue;
    private Integer yearValue;

    public Time() {
    }

    public Time(Term term, Year year) {
        this.term = term;
        this.year = year;
        this.termValue = term.getValue();
        this.yearValue = year.getValue();
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

<<<<<<< Updated upstream
    public Integer getTermValue() {
        return termValue;
    }

    public void setTermValue(Integer termValue) {
        this.termValue = termValue;
    }

=======
>>>>>>> Stashed changes
    public Integer getYearValue() {
        return yearValue;
    }

    public void setYearValue(Integer yearValue) {
        this.yearValue = yearValue;
    }
<<<<<<< Updated upstream
=======

    public Integer getTermValue() {
        return termValue;
    }

    public void setTermValue(Integer termValue) {
        this.termValue = termValue;
    }
>>>>>>> Stashed changes
}
