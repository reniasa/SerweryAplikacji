package login.service;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.zal.SerweryAplikacji.login.repository.RoleRepository;
import com.zal.SerweryAplikacji.login.model.User;
import com.zal.SerweryAplikacji.login.repository.UserRepository;
import com.zal.SerweryAplikacji.login.service.UserService;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.MockitoAnnotations.initMocks;

/*public class UserServiceTest {

    @Mock
    private UserRepository mockUserRepository;
    @Mock
    private RoleRepository mockRoleRepository;
    @Mock
    private BCryptPasswordEncoder mockBCryptPasswordEncoder;

    private UserService userServiceUnderTest;
    private User user;

    @Before
    public void setUp() {
        initMocks(this);
        userServiceUnderTest = new UserService(mockUserRepository,
                                               mockRoleRepository,
                                               mockBCryptPasswordEncoder);
        user = User.builder()
                .id(1)
                .name("Gustavo")
                .lastName("Ponce")
                .email("test@test.com")
                .build();

        Mockito.when(mockUserRepository.save(any()))
                .thenReturn(user);
        Mockito.when(mockUserRepository.findByEmail(anyString()))
                .thenReturn(user);
    }

    @Test
    public void testFindUserByEmail() {
        final String email = "test@test.com";

        final User result = userServiceUnderTest.findUserByEmail(email);

        assertEquals(email, result.getEmail());
    }

    @Test
    public void testSaveUser() {
        final String email = "test@test.com";

        User result = userServiceUnderTest.saveUser(User.builder().build());

        assertEquals(email, result.getEmail());
    }
}*/