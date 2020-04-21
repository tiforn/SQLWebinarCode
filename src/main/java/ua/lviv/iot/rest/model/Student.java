package ua.lviv.iot.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.ManyToAny;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.*;
import java.util.Set;

@Entity

@NamedNativeQuery(name = "Student.findBestStudent", query = "select * from students where id = 1")
public class Student {
    private String firstName;
    private String lastName;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "group_id")
    @JsonIgnoreProperties("students")
    private Group group;

    private Class<GeneratorType> generatorTypeClass = GeneratorType.class;

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;

    public Class<GeneratorType> getGeneratorTypeClass() {
        return generatorTypeClass;
    }

    public Set<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;
    }

    @ManyToMany(mappedBy = "students")
    private Set<Subject> subjects;

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
