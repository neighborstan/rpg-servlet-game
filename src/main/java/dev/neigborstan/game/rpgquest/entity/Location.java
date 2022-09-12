package dev.neigborstan.game.rpgquest.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Location {
    @Getter
    private int id;
    @Getter
    private String name;
    @Getter
    private List<Location> locationsForMovement;
    @Getter
    @Setter
    private boolean block;

    public Location(int id, String name, boolean block) {
        this.id = id;
        this.name = name;
        this.block = block;
        locationsForMovement = new ArrayList<>();
    }
}
