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
      checkNotFoundForGetters(user);
      return user;
  }

  @Override
  public User findByUsername(String username) {
      User user = userRepository.findByUsername(username);
      checkNotFoundForGetters(user);
      return user;
  }

  @Override
  public User findByEmail(String email) {
      User user = userRepository.findByEmail(email);
      checkNotFoundForGetters(user);
      return user;
  }

  @Override
  public User createUser(User user) {
      return userRepository.save(user);
  }

  @Override
  public User updateUser(User user) {
      User oldUser = findByUuid(user.getUuid());
      checkNotFoundForGetters(oldUser);
      return userRepository.save(user);
  }

  @Override
  public void deleteUser(User user) {
    userRepository.delete(user);
  }

  @Override
  public void deleteUserByUuid(String uuid) {
    userRepository.delete(uuid);
  }

    private void checkNotFoundForGetters(User user) {
        if (user == null) {
            throw new JavaForumException(Error.USER_NOT_FOUND);
        }
    }
}
