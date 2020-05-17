package lab1.model;

import javax.persistence.*;

@Entity
public class StudyForm {

    @Id
    @SequenceGenerator(name = "study_form_seq", sequenceName = "study_form_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "study_form_seq")
    private Long id;
    private String name;

    public StudyForm() {
    }

    public StudyForm(String name) {
        this.name = name;
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
}
