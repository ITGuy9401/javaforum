package eu.arcangelovicedomini.javaforum.api.service;

import eu.arcangelovicedomini.javaforum.api.domain.User;
import eu.arcangelovicedomini.javaforum.api.exceptions.Error;
import eu.arcangelovicedomini.javaforum.api.exceptions.JavaForumException;
import eu.arcangelovicedomini.javaforum.api.repository.UserRepository;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.UUID;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasProperty;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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
        when(userRepository.findByUsername(user.getUsername())).thenReturn(user);

        User byUuid = userService.findByUsername(user.getUsername());
        assertEquals(byUuid.getUsername(), user.getUsername());
    }

    @Test
    public void findByEmailThrowsErrorWhenNotFound() throws Exception {
        expectedException.expect(JavaForumException.class);
        expectedException.expect(hasProperty("error", equalTo(Error.USER_NOT_FOUND)));
        userService.findByUsername("dr@frankenstein.de");
    }

    @Test
    public void createUser() throws Exception {
    }

    @Test
    public void updateUser() throws Exception {
    }

    @Test
    public void deleteUser() throws Exception {
    }

    @Test
    public void deleteUserByUuid() throws Exception {
    }

}