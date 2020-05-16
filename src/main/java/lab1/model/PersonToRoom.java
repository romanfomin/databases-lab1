package lab1.model;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class PersonToRoom {

    @Id
    private String id;
    Person person;
    Room room;
    Date from;
    Date to;

    public PersonToRoom(Person person, Room room) {
        this.person = person;
        this.room = room;
    }

    public String getId() {
        return id;
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

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }
}
