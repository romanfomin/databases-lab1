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
