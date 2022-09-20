package dev.neigborstan.game.rpgquest.repository;

import dev.neigborstan.game.rpgquest.entity.User;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class UserRepoTest {

    @Test
    void createUser() {
        UserRepo userRepo = new UserRepo();

        String expectedUsername = "userName";
        userRepo.createUser(expectedUsername);

        User actual = userRepo.getUsers().stream()
                .filter(user -> user.getName().equals(expectedUsername))
                .findFirst()
                .get();

        assertEquals(expectedUsername, actual.getName());
    }

    @Test
    void restartUser() {


    }

    @Test
    void deleteUser() {
        UserRepo userRepo = new UserRepo();
        List<User> users = new ArrayList<>();
        IntStream.rangeClosed(1, 3)
                .forEach(num -> users.add(new User(num, "name" + num, num, Mockito.mock(LocationRepo.class))));

        userRepo.getUsers().addAll(users);

        User name = users.get(1);
        userRepo.deleteUser(name);

        assertFalse(userRepo.getUsers().contains(name));
    }

    @Test
    void getUserByName() {
    }
}