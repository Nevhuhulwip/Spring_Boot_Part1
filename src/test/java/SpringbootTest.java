import org.junit.jupiter.api.Test;

public class SpringbootTest {
    UserService user;
    @Test
    void contextLoads() {
        user.removeUser(1);
        user.getUser(1);
    }
}
