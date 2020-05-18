package lab1.model.mongo;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Room {

    @Id
    @SequenceGenerator(name = "room_seq", sequenceName = "room_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "room_seq")
    private Long id;
    private Integer capacity;
    private boolean insects;
    private Integer warning;
    private Date desinfection;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "university_campus_id", nullable = false)
    private UniversityCampus universityCampus;

    public Room() {
    }

    public Room(Integer capacity, boolean insects, Integer warning, Date desinfection, UniversityCampus universityCampus) {
        this.capacity = capacity;
        this.insects = insects;
        this.warning = warning;
        this.desinfection = desinfection;
        this.universityCampus = universityCampus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public UniversityCampus getUniversityCampus() {
        return universityCampus;
    }

    public void setUniversityCampus(UniversityCampus universityCampus) {
        this.universityCampus = universityCampus;
    }
}
