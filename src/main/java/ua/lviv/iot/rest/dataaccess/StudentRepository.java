package ua.lviv.iot.rest.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.rest.model.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
