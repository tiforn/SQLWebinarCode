package ua.lviv.iot.rest.model;


import org.hibernate.annotations.GeneratorType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
    private String firstName;
    private String lastName;

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
}
