package eu.arcangelovicedomini.javaforum.api.service;

import static org.apache.commons.lang3.StringUtils.isBlank;

import eu.arcangelovicedomini.javaforum.api.domain.User;
import eu.arcangelovicedomini.javaforum.api.repository.UserRepository;
import org.apache.commons.lang3.StringUtils;
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
    return userRepository.findOne(uuid);
  }

  @Override
  public User findByUsername(String username) {
    return userRepository.findByUsername(username);
  }

  @Override
  public User findByEmail(String email) {
    return userRepository.findByEmail(email);
  }

  @Override
  public User createUser(User user) {

    if (user.getUuid() != null) {
      throw new RuntimeException("TBD");
    }

    // FIXME additional validation

    user = userRepository.save(user);

    return user;
  }

  @Override
  public User updateUser(User user) {
    if (isBlank(user.getUuid())) {
      throw new RuntimeException("TBD");
    }

    // FIXME additional validation

    user = userRepository.save(user);

    return user;
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
