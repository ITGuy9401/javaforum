package eu.arcangelovicedomini.javaforum.api.service;

import eu.arcangelovicedomini.javaforum.api.domain.Forum;
import org.springframework.stereotype.Service;

@Service
public interface ForumService {

  Forum getById(Long forumId);
  Forum create(Forum forum);
  Forum update(Forum forum);
  void delete(Forum forum);
  void delete(Long forumId);
}
