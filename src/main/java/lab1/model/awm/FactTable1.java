package lab1.model.awm;

import javax.persistence.*;

@Entity
public class FactTable1 {

    @Id
    @SequenceGenerator(name = "fact_table1_seq", sequenceName = "fact_table1_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fact_table1_seq")
    private Long id;
    private Integer diplomaWithHonors;
    private Integer usualDiploma;
    private Integer publications;
    private Integer studentLibraryCards;
    private Integer conferences;
    private Integer employeeLibraryCards;
    private Integer liveInCampus;
    private Integer notLiveInCampus;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "time_id", nullable = false)
    private Time time;

    public FactTable1() {
    }

    public FactTable1(Integer diplomaWithHonors, Integer usualDiploma, Integer publications, Integer studentLibraryCards, Integer conferences, Integer employeeLibraryCards, Integer liveInCampus, Integer notLiveInCampus, Time time) {
        this.diplomaWithHonors = diplomaWithHonors;
        this.usualDiploma = usualDiploma;
        this.publications = publications;
        this.studentLibraryCards = studentLibraryCards;
        this.conferences = conferences;
        this.employeeLibraryCards = employeeLibraryCards;
        this.liveInCampus = liveInCampus;
        this.notLiveInCampus = notLiveInCampus;
        this.time = time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDiplomaWithHonors() {
        return diplomaWithHonors;
    }

    public void setDiplomaWithHonors(Integer diplomaWithHonors) {
        this.diplomaWithHonors = diplomaWithHonors;
    }

    public Integer getUsualDiploma() {
        return usualDiploma;
    }

    public void setUsualDiploma(Integer usualDiploma) {
        this.usualDiploma = usualDiploma;
    }

    public Integer getPublications() {
        return publications;
    }

    public void setPublications(Integer publications) {
        this.publications = publications;
    }

    public Integer getStudentLibraryCards() {
        return studentLibraryCards;
    }

    public void setStudentLibraryCards(Integer studentLibraryCards) {
        this.studentLibraryCards = studentLibraryCards;
    }

    public Integer getConferences() {
        return conferences;
    }

    public void setConferences(Integer conferences) {
        this.conferences = conferences;
    }

    public Integer getEmployeeLibraryCards() {
        return employeeLibraryCards;
    }

    public void setEmployeeLibraryCards(Integer employeeLibraryCards) {
        this.employeeLibraryCards = employeeLibraryCards;
    }

    public Integer getLiveInCampus() {
        return liveInCampus;
    }

    public void setLiveInCampus(Integer liveInCampus) {
        this.liveInCampus = liveInCampus;
    }

    public Integer getNotLiveInCampus() {
        return notLiveInCampus;
    }

    public void setNotLiveInCampus(Integer notLiveInCampus) {
        this.notLiveInCampus = notLiveInCampus;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
