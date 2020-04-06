package ua.lviv.iot.rest.business;

import org.springframework.beans.factory.annotation.Autowired;
import ua.lviv.iot.rest.dataaccess.SubjectRepository;
import ua.lviv.iot.rest.model.Subject;

import java.util.List;

public class SubjectService {
    @Autowired
    private SubjectRepository repository;

    public List<Subject> getAllSubjects(){
        return repository.findAll();
    }
}
