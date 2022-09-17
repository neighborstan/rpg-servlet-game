package dev.neigborstan.game.rpgquest.init;

import dev.neigborstan.game.rpgquest.entity.Location;
import dev.neigborstan.game.rpgquest.entity.LocationKey;
import dev.neigborstan.game.rpgquest.entity.Person;
import dev.neigborstan.game.rpgquest.entity.Question;
import lombok.Getter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonInit {
    private final Map<Integer, Person> persons = new HashMap<>();

    public PersonInit(LocationInit locationInit, QuestionInit questionInit, LocationKeyInit key) {

        Person trekon = new Person(1, "Trekon", locationInit.getLocationById(1), questionInit.getQuestionById(1), key.getLocationKeyById(1));
        Person tibost = new Person(2, "Tibost", locationInit.getLocationById(3), questionInit.getQuestionById(7), key.getLocationKeyById(2));
        Person faramond = new Person(3, "Faramond", locationInit.getLocationById(5), questionInit.getQuestionById(13), key.getLocationKeyById(3));
        Person gaglus = new Person(4, "Gaglus", locationInit.getLocationById(7), questionInit.getQuestionById(19), key.getLocationKeyById(6));
        Person rineamit = new Person(5, "Rineamit", locationInit.getLocationById(8), questionInit.getQuestionById(37), key.getLocationKeyById(7));
        Person hudd = new Person(6, "Hudd", locationInit.getLocationById(9), questionInit.getQuestionById(25), key.getLocationKeyById(5));
        Person reala = new Person(7, "Reala", locationInit.getLocationById(11), questionInit.getQuestionById(31), key.getLocationKeyById(8));
        Person holren = new Person(8, "Holren", locationInit.getLocationById(12), questionInit.getQuestionById(43), key.getLocationKeyById(4));
        Person linetta = new Person(9, "Linetta", locationInit.getLocationById(15), questionInit.getQuestionById(49), key.getLocationKeyById(9));
//        Person okada = new Person(10, "Okada", kunszalia, question1);
//        Person ammia = new Person(11, "Ammia", freitileria, question1);
//        Person faradir = new Person(12, "Faradir", alfnirland, question1);
//        Person adoel = new Person(13, "Adoel", abrenus, question1);
//        Person lorion = new Person(14, "Lorion", nolahmaa, question1);
//        Person domoto = new Person(15, "Domoto", akosia, question1);

        persons.put(1, trekon);
        persons.put(2, tibost);
        persons.put(3, faramond);
        persons.put(4, gaglus);
        persons.put(5, rineamit);
        persons.put(6, hudd);
        persons.put(7, reala);
        persons.put(8, holren);
        persons.put(9, linetta);
    }

    public Person getPersonById(int personId){
        return persons.get(personId);
    }

    public List<Person> getPersonsByLocationId(int locationId) {
        return persons.values().stream()
                .filter(v -> v.getLocation().getId() == locationId)
                .collect(Collectors.toList());
    }
}
