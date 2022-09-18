package dev.neigborstan.game.rpgquest.repository;

import dev.neigborstan.game.rpgquest.entity.Person;

import java.util.List;
import java.util.stream.Collectors;

public class PersonRepo extends Repository<Integer, Person>{

    public List<Person> getPersonsByLocationId(int locationId) {
        return repo.values().stream()
                .filter(v -> v.getLocation().getId() == locationId)
                .collect(Collectors.toList());
    }
}
