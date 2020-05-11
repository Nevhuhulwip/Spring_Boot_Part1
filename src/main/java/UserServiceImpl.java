import com.Springboot.User;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
class UserServiceImpl implements UserService {
    private static Map<String, User> fakeRepo= new HashMap<>();
    static {
        User user = new User(1,"Pfano","Nev");

        fakeRepo.put(String.valueOf(user.getId()), user);
    }
    @Override
    public void addUser(User user) {
        fakeRepo.put(String.valueOf(user.getId()),user);
    }

    @Override
    public void removeUser(long id) {
        fakeRepo.remove(id);
    }

    @Override
    public void getUser(long id) {
        fakeRepo.values();
    }
}
