package lab1.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Publication {

    @Id
    @SequenceGenerator(name = "publication_seq", sequenceName = "publication_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "publication_seq")
    private Long id;
    private String name;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "publication_to_author",
            joinColumns = @JoinColumn(name = "publication_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id")
    )
    private List<Participant> authors;
    private Date date;

    public Publication() {
    }

    public Publication(String name, List<Participant> authors, Date date) {
        this.name = name;
        this.authors = authors;
        this.date = date;
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

    public List<Participant> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Participant> authors) {
        this.authors = authors;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
