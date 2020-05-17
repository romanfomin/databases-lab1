package lab1.model.mongo;

import javax.persistence.*;
import java.util.List;

@Entity
public class UniversityCampus {

    @Id
    @SequenceGenerator(name = "university_campus_seq", sequenceName = "university_campus_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "university_campus_seq")
    private Long id;
    private String address;
    private Integer numberOfRooms;
    @OneToMany(mappedBy = "universityCampus", fetch = FetchType.EAGER)
    private List<Room> rooms;

    public UniversityCampus() {
    }

    public UniversityCampus(String address, Integer numberOfRooms) {
        this.address = address;
        this.numberOfRooms = numberOfRooms;
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