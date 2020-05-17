package lab1.model.awm;

import javax.persistence.*;

@Entity
public class FactTable4 {

    @Id
    @SequenceGenerator(name = "fact_table4_seq", sequenceName = "fact_table4_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fact_table4_seq")
    private Long id;
    private Double avgPeopleInOneRoom;
    private Integer aOnlyStudents;
    private Integer aAndBOnlyStudents;
    private Integer aToEStudents;
    private Integer studentsWithDebts;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "campus_id", nullable = false)
    private Campus campus;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "time_id", nullable = false)
    private Time time;

    public FactTable4() {
    }

    public FactTable4(Double avgPeopleInOneRoom, Integer aOnlyStudents, Integer aAndBOnlyStudents, Integer aToEStudents, Integer studentsWithDebts, Campus campus, Time time) {
        this.avgPeopleInOneRoom = avgPeopleInOneRoom;
        this.aOnlyStudents = aOnlyStudents;
        this.aAndBOnlyStudents = aAndBOnlyStudents;
        this.aToEStudents = aToEStudents;
        this.studentsWithDebts = studentsWithDebts;
        this.campus = campus;
        this.time = time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAvgPeopleInOneRoom() {
        return avgPeopleInOneRoom;
    }

    public void setAvgPeopleInOneRoom(Double avgPeopleInOneRoom) {
        this.avgPeopleInOneRoom = avgPeopleInOneRoom;
    }

    public Integer getaOnlyStudents() {
        return aOnlyStudents;
    }

    public void setaOnlyStudents(Integer aOnlyStudents) {
        this.aOnlyStudents = aOnlyStudents;
    }

    public Integer getaAndBOnlyStudents() {
        return aAndBOnlyStudents;
    }

    public void setaAndBOnlyStudents(Integer aAndBOnlyStudents) {
        this.aAndBOnlyStudents = aAndBOnlyStudents;
    }

    public Integer getaToEStudents() {
        return aToEStudents;
    }

    public void setaToEStudents(Integer aToEStudents) {
        this.aToEStudents = aToEStudents;
    }

    public Integer getStudentsWithDebts() {
        return studentsWithDebts;
    }

    public void setStudentsWithDebts(Integer studentsWithDebts) {
        this.studentsWithDebts = studentsWithDebts;
    }

    public Campus getCampus() {
        return campus;
    }

    public void setCampus(Campus campus) {
        this.campus = campus;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
