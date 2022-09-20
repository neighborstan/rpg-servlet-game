package dev.neigborstan.game.rpgquest.repository;

import dev.neigborstan.game.rpgquest.entity.User;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class UserRepoTest {

    @Test
    void createUser() {
        String expectedUsername = "userName";
        UserRepo userRepo = new UserRepo();
        userRepo.createUser(expectedUsername);

        User actual = userRepo.getUsers().stream()
                .filter(user -> user.getName().equals(expectedUsername))
                .findFirst()
                .get();

        assertEquals(expectedUsername, actual.getName());
    }

    @Test
    void restartUser() {
//        НЕ СМОГ (

    }

    @Test
    void deleteUser() {
    }

    @Test
    void getUserByName() {
    }
}