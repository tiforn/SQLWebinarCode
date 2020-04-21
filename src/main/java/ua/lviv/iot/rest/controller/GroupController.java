package ua.lviv.iot.rest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.rest.business.GroupService;
import ua.lviv.iot.rest.model.Group;

@RequestMapping("/groups")
@RestController
public class GroupController {
    @Autowired
    private GroupService orderService;

    @GetMapping
    private List<Group> findAllGroups() {
        return orderService.findAll();
    }

}
