package lab1.model.awm;

import javax.persistence.*;

@Entity
public class FactTable2 {

    @Id
    @SequenceGenerator(name = "fact_table2_seq", sequenceName = "fact_table2_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fact_table2_seq")
    private Long id;
    private Integer people;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "birth_place_id", nullable = false)
    private BirthPlace birthPlace;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "time_id", nullable = false)
    private Time time;

    public FactTable2() {
    }

    public FactTable2(Integer people, BirthPlace birthPlace, Time time) {
        this.people = people;
        this.birthPlace = birthPlace;
        this.time = time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPeople() {
        return people;
    }

    public void setPeople(Integer people) {
        this.people = people;
    }

    public BirthPlace getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(BirthPlace birthPlace) {
        this.birthPlace = birthPlace;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
