package lab1.model;

import javax.persistence.*;

@Entity
public class BirthPlace {

    @Id
    @SequenceGenerator(name = "birth_place_seq", sequenceName = "birth_place_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "birth_place_seq")
    private Long id;
    private String district;
    private String city;
    private String country;

    public BirthPlace() {
    }

    public BirthPlace(String district, String city, String country) {
        this.district = district;
        this.city = city;
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
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
