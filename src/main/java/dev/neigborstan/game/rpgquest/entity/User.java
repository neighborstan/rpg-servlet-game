package dev.neigborstan.game.rpgquest.entity;

import dev.neigborstan.game.rpgquest.repository.LocationRepo;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class User {
    private int id;
    private String name;
    @Setter
    private int currentLocationId;
    @Setter
    private LocationRepo locationRepo;
}
