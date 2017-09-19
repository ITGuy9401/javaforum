package eu.arcangelovicedomini.javaforum.api.service;

import eu.arcangelovicedomini.javaforum.api.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
  @Override
  public User findByUuid(String uuid) {
    return null;
  }

  @Override
  public User findByName(String username) {
    return null;
  }

  @Override
  public User findByEmail(String email) {
    return null;
  }

  @Override
  public User createUser(User user) {
    return null;
  }

  @Override
  public User updateUser(User user) {
    return null;
  }

  @Override
  public void deleteUser(User user) {

  }

  @Override
  public void deleteUserByUuid(String uuid) {

  }
}
