package lab1.model.awm;

import javax.persistence.*;

@Entity
public class Campus {

    @Id
    @SequenceGenerator(name = "campus_seq", sequenceName = "campus_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "campus_seq")
    private Long id;
    private String address;

    public Campus() {
    }

    public Campus(String address) {
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
