package dev.neigborstan.game.rpgquest.repository;

import dev.neigborstan.game.rpgquest.entity.Location;
import dev.neigborstan.game.rpgquest.init.LocationInit;

public class LocationRepo extends Repository<Integer, Location> {
    private final LocationInit locationInit;

    public LocationRepo(LocationInit locationInit) {
        this.locationInit = locationInit;
    }

    public Location getLocationById(int locationId) {

        return locationInit.getLocations().stream()
                .filter(userLocation -> userLocation.getId() == locationId)
                .findFirst()
                .orElseThrow();
    }
}
