package eu.arcangelovicedomini.javaforum.api.repository;

import eu.arcangelovicedomini.javaforum.api.domain.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, String> {
}
