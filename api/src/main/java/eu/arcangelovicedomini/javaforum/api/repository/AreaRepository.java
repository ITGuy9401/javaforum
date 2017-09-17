package eu.arcangelovicedomini.javaforum.api.repository;

import eu.arcangelovicedomini.javaforum.api.domain.Area;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaRepository extends CrudRepository<Area, String> {
}
