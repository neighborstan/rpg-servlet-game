package dev.neigborstan.game.rpgquest.init;

import dev.neigborstan.game.rpgquest.entity.Location;
import dev.neigborstan.game.rpgquest.entity.LocationKey;
import dev.neigborstan.game.rpgquest.entity.Person;
import dev.neigborstan.game.rpgquest.entity.Question;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

public class PersonInit {
    @Getter
    private final Map<Integer, Person> persons = new HashMap<>();

    public PersonInit(Map<Integer, Location> locations, Map<Integer, Question> questions, Map<Integer, LocationKey> locationsKeys) {

        Person trekon = new Person(1, "Trekon", locations.get(1), questions.get(1), locationsKeys.get(1));
        Person tibost = new Person(2, "Tibost", locations.get(3), questions.get(7), locationsKeys.get(2));
        Person faramond = new Person(3, "Faramond", locations.get(5), questions.get(13), locationsKeys.get(3));
        Person gaglus = new Person(4, "Gaglus", locations.get(7), questions.get(19), locationsKeys.get(6));
        Person rineamit = new Person(5, "Rineamit", locations.get(8), questions.get(37), locationsKeys.get(7));
        Person hudd = new Person(6, "Hudd", locations.get(9), questions.get(25), locationsKeys.get(5));
        Person reala = new Person(7, "Reala", locations.get(11), questions.get(31), locationsKeys.get(8));
        Person holren = new Person(8, "Holren", locations.get(12), questions.get(43), locationsKeys.get(4));
        Person linetta = new Person(9, "Linetta", locations.get(15), questions.get(49), locationsKeys.get(9));
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
}
