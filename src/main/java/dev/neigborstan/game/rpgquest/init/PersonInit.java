package dev.neigborstan.game.rpgquest.init;

import dev.neigborstan.game.rpgquest.entity.Person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonInit {
    private final Map<Integer, Person> persons = new HashMap<>();

    public PersonInit(LocationInit locationInit, QuestionInit questionInit, LocationKeyInit key) {

        persons.put(1, new Person(1, "Trekon", locationInit.getLocationById(1), questionInit.getQuestionById(1), key.getLocationKeyById(1)));
        persons.put(2, new Person(2, "Tibost", locationInit.getLocationById(3), questionInit.getQuestionById(7), key.getLocationKeyById(2)));
        persons.put(3, new Person(3, "Faramond", locationInit.getLocationById(5), questionInit.getQuestionById(13), key.getLocationKeyById(3)));
        persons.put(4, new Person(4, "Gaglus", locationInit.getLocationById(7), questionInit.getQuestionById(19), key.getLocationKeyById(6)));
        persons.put(5, new Person(5, "Rineamit", locationInit.getLocationById(8), questionInit.getQuestionById(37), key.getLocationKeyById(7)));
        persons.put(6, new Person(6, "Hudd", locationInit.getLocationById(9), questionInit.getQuestionById(25), key.getLocationKeyById(5)));
        persons.put(7, new Person(7, "Reala", locationInit.getLocationById(11), questionInit.getQuestionById(31), key.getLocationKeyById(8)));
        persons.put(8, new Person(8, "Holren", locationInit.getLocationById(12), questionInit.getQuestionById(43), key.getLocationKeyById(4)));
        persons.put(9, new Person(9, "Linetta", locationInit.getLocationById(15), questionInit.getQuestionById(49), key.getLocationKeyById(9)));
    }

    public Person getPersonById(int personId) {
        return persons.get(personId);
    }

    public List<Person> getPersonsByLocationId(int locationId) {
        return persons.values().stream()
                .filter(v -> v.getLocation().getId() == locationId)
                .collect(Collectors.toList());
    }
}
