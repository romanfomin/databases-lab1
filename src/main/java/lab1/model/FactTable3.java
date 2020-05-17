package lab1.model;

import javax.persistence.*;

@Entity
public class FactTable3 {

    @Id
    @SequenceGenerator(name = "fact_table3_seq", sequenceName = "fact_table3_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fact_table3_seq")
    private Long id;
    private Integer people;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "publisher_id", nullable = false)
    private Publisher publisher;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "time_id", nullable = false)
    private Time time;

    public FactTable3() {
    }

    public FactTable3(Integer people, Publisher publisher, Time time) {
        this.people = people;
        this.publisher = publisher;
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

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
