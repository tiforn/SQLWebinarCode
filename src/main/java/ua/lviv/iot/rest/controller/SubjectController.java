package ua.lviv.iot.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.rest.business.SubjectService;
import ua.lviv.iot.rest.model.Subject;

import java.util.List;

@RestController
@RequestMapping (path = "/subjects")
public class SubjectController {
    SubjectService service;

    @GetMapping
    public List<Subject> getAllSubjects(){
        return service.getAllSubjects();
    }
}
