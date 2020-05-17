package lab1.model.mysql;

import javax.persistence.*;
import java.util.Date;

@Entity
public class LibraryInfo {

    @Id
    @SequenceGenerator(name = "library_info_seq", sequenceName = "library_info_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "library_info_seq")
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "edition_id", nullable = false)
    private Edition edition;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "participant_id", nullable = false)
    private Participant participant;
    private Date fromDate;
    private Date toDate;

    public LibraryInfo() {
    }

    public LibraryInfo(Edition edition, Participant participant, Date fromDate, Date toDate) {
        this.edition = edition;
        this.participant = participant;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public Long getId() {
        return id;
    }

    public Edition getEdition() {
        return edition;
    }

    public void setEdition(Edition edition) {
        this.edition = edition;
    }

    public Participant getParticipant() {
        return participant;
    }

    public void setParticipant(Participant participant) {
        this.participant = participant;
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
