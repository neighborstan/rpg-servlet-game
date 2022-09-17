package dev.neigborstan.game.rpgquest.entity;

import lombok.Getter;

@Getter
public class Person {
    private int id;
    private String name;
    private Location location;
    private Question startQuestion;
    private LocationKey key;

    public Person(int id, String name, Location location, Question startQuestion) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.startQuestion = startQuestion;
    }

    public Person(int id, String name, Location location, Question startQuestion, LocationKey key) {
        this(id, name, location, startQuestion);
        this.key = key;
    }
}
