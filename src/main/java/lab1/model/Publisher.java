package lab1.model;

import javax.persistence.*;

@Entity
public class Publisher {

    @Id
    @SequenceGenerator(name = "publisher_seq", sequenceName = "publisher_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "publisher_seq")
    private Long id;
    private String edition;
    private String city;
    private String country;

    public Publisher() {
    }

    public Publisher(String edition, String city, String country) {
        this.edition = edition;
        this.city = city;
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
