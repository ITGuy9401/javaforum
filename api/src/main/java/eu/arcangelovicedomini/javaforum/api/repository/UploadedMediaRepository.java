package eu.arcangelovicedomini.javaforum.api.repository;

import eu.arcangelovicedomini.javaforum.api.domain.UploadedMedia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UploadedMediaRepository extends CrudRepository<UploadedMedia, String> {
}
