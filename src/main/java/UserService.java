import com.Springboot.User;

public interface UserService {
    void addUser(User user);
    void removeUser(long id);
    void getUser(long id);
}
