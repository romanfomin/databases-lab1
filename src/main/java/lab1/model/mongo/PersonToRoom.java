package lab1.model.mongo;

import javax.persistence.*;
import java.util.Date;

@Entity
public class PersonToRoom {

    @Id
    @SequenceGenerator(name = "person_to_room_seq", sequenceName = "person_to_room_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_to_room_seq")
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "person_id", nullable = false)
    Person person;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "room_id", nullable = false)
    Room room;
    Date fromDate;
    Date toDate;

    public PersonToRoom() {
    }

    public PersonToRoom(Person person, Room room, Date fromDate, Date toDate) {
        this.person = person;
        this.room = room;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
}
