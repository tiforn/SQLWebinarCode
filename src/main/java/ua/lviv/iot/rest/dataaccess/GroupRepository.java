package ua.lviv.iot.rest.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.iot.rest.model.Group;

public interface GroupRepository extends JpaRepository <Group, Integer> {
}
