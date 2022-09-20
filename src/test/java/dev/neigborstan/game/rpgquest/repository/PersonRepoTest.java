package dev.neigborstan.game.rpgquest.repository;

import dev.neigborstan.game.rpgquest.entity.Location;
import dev.neigborstan.game.rpgquest.entity.LocationKey;
import dev.neigborstan.game.rpgquest.entity.Person;
import dev.neigborstan.game.rpgquest.entity.Question;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class PersonRepoTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    void getPersonsByLocationId(int locationId) {
        List<Person> persons = new ArrayList<>();

        Question question = Mockito.mock(Question.class);
        LocationKey key = Mockito.mock(LocationKey.class);
        IntStream.rangeClosed(1, 5)
                .forEach((num) -> persons.add(new Person(
                        num, "text" + num, new Location(num, "name" + num, false), question, key))
                );

        PersonRepo personRepo = new PersonRepo();
        for (Person person : persons) {
            personRepo.save(person.getId(), person);
        }

        List<Person> expected = persons.stream()
                .filter(v -> v.getLocation().getId() == locationId)
                .toList();

        List<Person> actual = personRepo.getPersonsByLocationId(locationId);

        assertEquals(expected, actual);
    }
}