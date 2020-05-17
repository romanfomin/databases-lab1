package lab1.model;

import javax.persistence.*;

@Entity
public class Campus {

    @Id
    @SequenceGenerator(name = "campus_seq", sequenceName = "campus_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "campus_seq")
    private Long id;
    private String address;

    public Campus() {
    }

    public Campus(String address) {
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

package lab1.model;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Campus {

    @Id
    private String id;
    private String address;
    private Integer numberOfRooms;
    private List<Room> rooms;

    public Campus(String address, Integer numberOfRooms) {
        this.address = address;
        this.numberOfRooms = numberOfRooms;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(Integer numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
}
