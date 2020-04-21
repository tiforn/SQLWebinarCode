package ua.lviv.iot.rest.business;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.iot.rest.dataaccess.SubjectRepository;
import ua.lviv.iot.rest.model.Subject;

@Service
public class SubjectService {
    @Autowired
    private SubjectRepository repository;

    public List<Subject> getAllSubjects() {
        return repository.findAll();
    }
}
