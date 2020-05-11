import com.Springboot.User;

public interface FakeRepoInterface<T> {
    public T insertUser(User user);

    public T findUserById(long id);

    public T deleteUser(long id);
}

