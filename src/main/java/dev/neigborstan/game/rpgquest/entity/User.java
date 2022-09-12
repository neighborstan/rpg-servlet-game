package dev.neigborstan.game.rpgquest.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;


public class User {
    @Getter
    private int id;
    @Getter
    private String name;
    @Getter
    @Setter
    private int currentLocationId;
    @Getter
    private Map<Integer, Location> locations;


    public User(int id, String name, int currentLocationId, Map<Integer, Location> locations) {
        this.id = id;
        this.name = name;
        this.currentLocationId = currentLocationId;
        this.locations = locations;
    }
}
