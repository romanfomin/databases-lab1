package lab1.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Conference {

    @Id
    @SequenceGenerator(name = "conference_seq", sequenceName = "conference_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "conference_seq")
    private Long id;
    private String name;
    private String address;
    private Date date;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "conference_to_participant",
            joinColumns = @JoinColumn(name = "conference_id"),
            inverseJoinColumns = @JoinColumn(name = "participant_id")
    )
    private List<Participant> participants;

    public Conference() {
    }

    public Conference(String name, String address, Date date, List<Participant> participants) {
        this.name = name;
        this.address = address;
        this.date = date;
        this.participants = participants;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }
}
