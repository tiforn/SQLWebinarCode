package ua.lviv.iot.rest.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.rest.dataaccess.GroupRepository;
import ua.lviv.iot.rest.model.Group;

import java.util.List;

@Service
public class GroupService {

    @Autowired
    private GroupRepository repository;

    public List<Group> findAll()
    {
        return repository.findAll();
    }
}
