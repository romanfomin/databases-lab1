package lab1.model;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Room {

    @Id
    private String id;
    private Integer capacity;
    private boolean insects;
    private Integer warning;
    private Date desinfection;

    public Room(Integer capacity) {
        this.capacity = capacity;
    }

    public String getId() {
        return id;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public boolean isInsects() {
        return insects;
    }

    public void setInsects(boolean insects) {
        this.insects = insects;
    }

    public Integer getWarning() {
        return warning;
    }

    public void setWarning(Integer warning) {
        this.warning = warning;
    }

    public Date getDesinfection() {
        return desinfection;
    }

    public void setDesinfection(Date desinfection) {
        this.desinfection = desinfection;
    }
}
