package lab1.model.mysql;

import javax.persistence.*;
import java.util.List;

@Entity
public class Edition {

    @Id
    @SequenceGenerator(name = "edition_seq", sequenceName = "edition_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "edition_seq")
    private Long id;
    private String name;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "edition_type_id", nullable = false)
    private EditionType editionType;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "language_id", nullable = false)
    private Language language;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "edition_to_publication",
            joinColumns = @JoinColumn(name = "edition_id"),
            inverseJoinColumns = @JoinColumn(name = "publication_id")
    )
    private List<Publication> publications;

    public Edition() {
    }

    public Edition(String name, EditionType editionType, Language language, List<Publication> publications) {
        this.name = name;
        this.editionType = editionType;
        this.language = language;
        this.publications = publications;
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

    public EditionType getEditionType() {
        return editionType;
    }

    public void setEditionType(EditionType editionType) {
        this.editionType = editionType;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public List<Publication> getPublications() {
        return publications;
    }

    public void setPublications(List<Publication> publications) {
        this.publications = publications;
    }
}
