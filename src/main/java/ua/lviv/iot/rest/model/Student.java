package ua.lviv.iot.rest.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.ManyToAny;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.*;

@Entity
public class Student {
    private String firstName;
    private String lastName;

    @ManyToOne (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "group_id")
    @JsonIgnoreProperties ("students")
    private Group group;

    private final Class<GeneratorType> generatorTypeClass = GeneratorType.class;
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;

    public Student(String firstName, String lastName) {
       this(firstName, lastName, 33);
    }

    public Student(String firstName, String lastName, Integer id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public Student() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
