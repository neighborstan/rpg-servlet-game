package dev.neigborstan.game.rpgquest.repository;


import dev.neigborstan.game.rpgquest.entity.*;
import dev.neigborstan.game.rpgquest.init.*;
import lombok.Getter;

import java.util.*;
import java.util.stream.Collectors;

public class Repository {
    private static Repository INSTANCE;

    private int userId = 0;

    @Getter
    private  Map<Integer, Location> locations;
    @Getter
    private final Map<Integer, Question> questions;
    @Getter
    private final Map<Integer, Answer> answers;
    @Getter
    private final Map<Integer, LocationKey> locationsKeys;
    @Getter
    private final Map<Integer, Person> persons;
    @Getter
    private final List<User> users = new ArrayList<>();

    private Repository() {
        locations = new LocationInit().getLocations();
        locationsKeys = new LocationKeyInit(locations).getLocationsKeys();
        questions = new QuestionInit(locations).getQuestions();
        answers = new AnswerInit(locations, questions).getAnswers();
        persons = new PersonInit(locations, questions, locationsKeys).getPersons();

    }

    public static Repository getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Repository();
        }

        return INSTANCE;
    }

    public Person getPersonById(int personId){
        return persons.get(personId);
    }

    public List<Answer> getAnswersByQuestionId(int questionId){
        return answers.values().stream()
                .filter(v -> v.getPrev().getId() == questionId)
                .collect(Collectors.toList());
    }

    public Answer getAnswerById(Integer id) {
        return answers.get(id);
    }

    public List<Person> getPersonsByLocationId(int locationId){
        return persons.values().stream()
                .filter(v -> v.getLocation().getId() == locationId)
                .collect(Collectors.toList());
    }

    public void createUser(String userName){
        userId++;
        User user = new User(userId, userName, 1, new LocationInit().getLocations());
        users.add(user);
    }

    public void restartUser(User user){
        Map<Integer, Location> locationsDefault = new LocationInit().getLocations();
        locationsDefault.forEach((key, value) -> {
            user.getLocations().put(key, value);
        });
    }

    public void deleteUser (User user){
        users.remove(user);
    }

    public User getUserByName(String name){
        return users.stream()
                .filter(user -> user.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

}
