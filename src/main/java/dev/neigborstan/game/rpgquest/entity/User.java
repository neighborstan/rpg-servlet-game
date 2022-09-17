package dev.neigborstan.game.rpgquest.entity;

import dev.neigborstan.game.rpgquest.init.LocationInit;
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
    @Setter
    private LocationInit locationInit;


    public User(int id, String name, int currentLocationId, LocationInit locationInit) {
        this.id = id;
        this.name = name;
        this.currentLocationId = currentLocationId;
        this.locationInit = locationInit;
    }
}
