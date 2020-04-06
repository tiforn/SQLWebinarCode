package ua.lviv.iot.rest.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.rest.model.Student;

import javax.persistence.NamedQuery;
import java.util.List;


@Repository
@NamedQuery(name="Student.findBestStudent", query = "select * from students where id = 1")
public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findAllByFirstName(String firstName);

    List<Student> findAllByFirstNameAndLastName(String firstName, String lastName);


    Student findBestStudent();
}
