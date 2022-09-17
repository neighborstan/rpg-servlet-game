package dev.neigborstan.game.rpgquest.init;

import dev.neigborstan.game.rpgquest.entity.User;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class UserInit {
    private int userId = 0;
    @Getter
    private final List<User> users = new ArrayList<>();

    public UserInit() {
    }

    public void createUser(String userName) {
        userId++;
        User user = new User(userId, userName, 1, new LocationInit());
        users.add(user);
    }

    public void restartUser(User user) {
        user.setLocationInit(new LocationInit());
    }

    public void deleteUser(User user) {
        users.remove(user);
    }

    public User getUserByName(String name) {
        return users.stream()
                .filter(user -> user.getName().equals(name))
                .findFirst()
                .orElse(null);
    }
}
