package eu.arcangelovicedomini.javaforum.api.service;

import eu.arcangelovicedomini.javaforum.api.domain.User;
import eu.arcangelovicedomini.javaforum.api.exception.JFException;
import eu.arcangelovicedomini.javaforum.api.exception.JFKeys;
import eu.arcangelovicedomini.javaforum.api.repository.UserRepository;
import eu.arcangelovicedomini.javaforum.api.utils.ValidationUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static org.apache.commons.lang3.StringUtils.isBlank;

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
        if (user == null) throw new JFException(JFKeys.USER_NOT_FOUND);
        return user;
    }

    @Override
    public User findByUsername(String username) {
        User user = userRepository.findByUsername(username);
        if (user == null) throw new JFException(JFKeys.USER_NOT_FOUND);
        return user;
    }

    @Override
    public User findByEmail(String email) {
        User user = userRepository.findByEmail(email);
        if (user == null) throw new JFException(JFKeys.USER_NOT_FOUND);
        return user;
    }

    @Override
    public User createUser(User user) {

        if (user.getUuid() != null) {
            throw new JFException(JFKeys.USER_CREATE_UUID_PRESENT);
        }

        if (!ValidationUtils.isEmailValid(user.getEmail())) {
            throw new JFException(JFKeys.USER_EMAIL_NOT_VALID);
        }

        if (userRepository.findByEmail(user.getEmail()) != null) {
            throw new JFException(JFKeys.USER_EMAIL_ALREADY_USED);
        }

        // FIXME additional validation

        user = userRepository.save(user);

        return user;
    }

    @Override
    public User updateUser(User user) {
        if (isBlank(user.getUuid())) {
            throw new JFException(JFKeys.USER_MODIFY_UUID_NOT_PRESENT);
        }

        findByUuid(user.getUuid());

        User byEmail = userRepository.findByEmail(user.getEmail());
        if (byEmail != null && !byEmail.getUuid().equals(user.getUuid())) {
            throw new JFException(JFKeys.USER_EMAIL_ALREADY_USED);
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
