package ua.lviv.iot.rest.business;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.rest.dataaccess.GroupRepository;
import ua.lviv.iot.rest.model.Group;

@Service
public class GroupService {

    @Autowired
    private GroupRepository repository;

    public List<Group> findAll() {
        return repository.findAll();
    }
}
