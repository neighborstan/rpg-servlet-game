package dev.neigborstan.game.rpgquest.entity;

import lombok.Getter;

public class LocationKey {
    @Getter
    private int id;
    @Getter
    private Location location;

    public LocationKey(int id, Location location) {
        this.id = id;
        this.location = location;
    }
}
