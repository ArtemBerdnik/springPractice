package servicesImpl;

import entities.User;
import services.UserService;

import java.util.Collection;
import java.util.List;


public class UserServiceImpl implements UserService {

    private List<User> users;

    public UserServiceImpl(List<User> users) {
        this.users = users;
    }

    @Override
    public User getUserByEmail(String email) {
        return users.stream()
                .filter(user -> user.getEmailAddress().equals(email))
                .findFirst()
                .get();
    }

    @Override
    public void save(Object object) {
        users.add((User)object);
    }

    @Override
    public void remove(Object object) {
        if (object instanceof User) {
            users.remove(object);
        }
    }

    @Override
    public Object getById() {
        return null;
    }

    @Override
    public Collection getAll() {
        return users;
    }
}
