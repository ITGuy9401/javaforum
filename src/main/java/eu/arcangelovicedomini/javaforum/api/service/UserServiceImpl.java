package eu.arcangelovicedomini.javaforum.api.service;

import eu.arcangelovicedomini.javaforum.api.domain.User;
import eu.arcangelovicedomini.javaforum.api.exceptions.Error;
import eu.arcangelovicedomini.javaforum.api.exceptions.JavaForumException;
import eu.arcangelovicedomini.javaforum.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  private UserRepository userRepository;

  @Autowired
  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public User findByUuid(String uuid) {
      User user = userRepository.findOne(uuid);
      if (user == null) {
          throw new JavaForumException(Error.USER_NOT_FOUND);
      }
      return user;
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
    userRepository.delete(user);
  }

  @Override
  public void deleteUserByUuid(String uuid) {
    userRepository.delete(uuid);
  }
}
