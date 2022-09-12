package dev.neigborstan.game.rpgquest.entity;

import lombok.Getter;

public class Person {
    @Getter
    private int id;
    @Getter
    private String name;
    @Getter
    private Location location;
    @Getter
    private Question startQuestion;
    @Getter
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
