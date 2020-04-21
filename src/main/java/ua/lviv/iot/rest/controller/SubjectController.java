package ua.lviv.iot.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.rest.business.SubjectService;
import ua.lviv.iot.rest.model.Subject;

@RestController
@RequestMapping(path = "/subjects")
public class SubjectController {
    @Autowired
    SubjectService service;

    @GetMapping
    public List<Subject> getAllSubjects() {
        return service.getAllSubjects();
    }
}
