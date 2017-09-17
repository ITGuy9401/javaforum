package eu.arcangelovicedomini.javaforum.api.repository;

import eu.arcangelovicedomini.javaforum.api.domain.Group;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends CrudRepository<Group, Long> {
}
