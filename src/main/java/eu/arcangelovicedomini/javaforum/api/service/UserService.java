package eu.arcangelovicedomini.javaforum.api.service;

import eu.arcangelovicedomini.javaforum.api.domain.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

  User findByUuid(String uuid);
  User findByName(String username);
  User findByEmail(String email);
  User createUser(User user);
  User updateUser(User user);
  void deleteUser(User user);
  void deleteUserByUuid(String uuid);
}
