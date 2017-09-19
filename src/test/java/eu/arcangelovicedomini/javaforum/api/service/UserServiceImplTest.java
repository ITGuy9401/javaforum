package eu.arcangelovicedomini.javaforum.api.service;

import eu.arcangelovicedomini.javaforum.api.domain.User;
import eu.arcangelovicedomini.javaforum.api.exceptions.Error;
import eu.arcangelovicedomini.javaforum.api.exceptions.JavaForumException;
import eu.arcangelovicedomini.javaforum.api.repository.UserRepository;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.time.ZonedDateTime;
import java.util.UUID;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasProperty;
import static org.junit.Assert.*;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.*;

public class UserServiceImplTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    UserRepository userRepository;
    UserService userService;

    @Before
    public void setUp() throws Exception {
        userRepository = mock(UserRepository.class);

        userService = new UserServiceImpl(userRepository);
    }

    @Test
    public void findByUuid() throws Exception {
        User user = new User();
        user.setUuid(UUID.randomUUID().toString());
        when(userRepository.findOne(eq(user.getUuid()))).thenReturn(user);

        User byUuid = userService.findByUuid(user.getUuid());
        assertEquals(byUuid.getUuid(), user.getUuid());
        verify(userRepository, times(1)).findOne(user.getUuid());
    }

    @Test
    public void findByUuidThrowsErrorWhenNotFound() throws Exception {
        expectedException.expect(JavaForumException.class);
        expectedException.expect(hasProperty("error", equalTo(Error.USER_NOT_FOUND)));
        userService.findByUuid("FAKE_UUID_BUT_THE_ANSWER_IS_ALWAYS_42");
    }

    @Test
    public void findByUsername() throws Exception {
        User user = new User();
        user.setUsername("ArthurDent42");
        when(userRepository.findByUsername(user.getUsername())).thenReturn(user);

        User byUuid = userService.findByUsername(user.getUsername());
        assertEquals(byUuid.getUsername(), user.getUsername());
        verify(userRepository, times(1)).findByUsername(user.getUsername());
    }

    @Test
    public void findByUsernameThrowsErrorWhenNotFound() throws Exception {
        expectedException.expect(JavaForumException.class);
        expectedException.expect(hasProperty("error", equalTo(Error.USER_NOT_FOUND)));
        userService.findByUsername("SexyFlanders9999");
    }

    @Test
    public void findByEmail() throws Exception {
        User user = new User();
        user.setEmail("fordperfect@hitchhikersguidetothegalaxy.totallynotearth");
        when(userRepository.findByEmail(user.getEmail())).thenReturn(user);

        User byUuid = userService.findByEmail(user.getEmail());
        assertEquals(byUuid.getUsername(), user.getUsername());
        verify(userRepository, times(1)).findByEmail(user.getEmail());
    }

    @Test
    public void findByEmailThrowsErrorWhenNotFound() throws Exception {
        expectedException.expect(JavaForumException.class);
        expectedException.expect(hasProperty("error", equalTo(Error.USER_NOT_FOUND)));
        userService.findByUsername("dr@frankenstein.de");
    }

    @Test
    public void createUser() throws Exception {
        User user = new User();
        user.setBirthDate(ZonedDateTime.now().minusYears(45));
        when(userRepository.save(user)).then((invocation) -> {
            User newUser = new User();
            newUser.setUuid(UUID.randomUUID().toString());
            newUser.setBirthDate(((User) invocation.getArguments()[0]).getBirthDate());
            return newUser;
        });

        User createdUser = userService.createUser(user);
        assertNull(user.getUuid());
        assertNotNull(createdUser.getUuid());
        assertEquals(user.getBirthDate(), createdUser.getBirthDate());
        verify(userRepository, times(1)).save(user);
    }

    @Test
    public void updateUser() throws Exception {
        User user = new User();
        user.setUuid(UUID.randomUUID().toString());
        user.setBirthDate(ZonedDateTime.now().minusYears(45));
        when(userRepository.findOne(eq(user.getUuid()))).thenReturn(user);

        User updatedUser = new User();
        updatedUser.setUuid(user.getUuid());
        updatedUser.setBirthDate(ZonedDateTime.now().minusYears(22));
        when(userRepository.save(updatedUser)).thenReturn(updatedUser);

        User byUuid = userService.updateUser(updatedUser);
        assertEquals(byUuid.getUuid(), user.getUuid());
        assertNotEquals(user.getBirthDate(), byUuid.getBirthDate());
        verify(userRepository, times(1)).findOne(user.getUuid());
        verify(userRepository, times(1)).save(updatedUser);
    }

    @Test
    public void updateUserThrowsErrorWhenNotFound() throws Exception {
        User user = new User();
        user.setUuid(UUID.randomUUID().toString());
        user.setBirthDate(ZonedDateTime.now().minusYears(45));

        expectedException.expect(JavaForumException.class);
        expectedException.expect(hasProperty("error", equalTo(Error.USER_NOT_FOUND)));
        userService.updateUser(user);
    }

    @Test
    public void deleteUser() throws Exception {
    }

    @Test
    public void deleteUserByUuid() throws Exception {
    }

}