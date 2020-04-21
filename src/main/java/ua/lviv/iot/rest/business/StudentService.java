package ua.lviv.iot.rest.business;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.rest.dataaccess.StudentRepository;
import ua.lviv.iot.rest.model.Student;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student updateStudent(Integer id) {
        String query = "select * from students where id :id";
        String finalQuery = query + id;
        return null;
    }

    public Student getStudent(Integer id) {
        return (Student) studentRepository.getOne(id);
    }

    public List<Student> getAllStudentsByNAme(String name) {
        return studentRepository.findAllByFirstName(name);
    }

    public Student deleteStudent(Integer id) {
        if (studentRepository.findById(id).isPresent()) {
            Student std = studentRepository.getOne(id);

            studentRepository.deleteById(id);
            return std;
        }
        return null;

    }
}
