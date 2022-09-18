package dev.neigborstan.game.rpgquest.init;

import dev.neigborstan.game.rpgquest.entity.LocationKey;

import java.util.HashMap;
import java.util.Map;

public class LocationKeyInit {
    private final Map<Integer, LocationKey> locationsKeys = new HashMap<>();

    public LocationKeyInit(LocationInit locationInit) {

        locationsKeys.put(1, new LocationKey(1, locationInit.getLocationById(2)));
        locationsKeys.put(2, new LocationKey(2, locationInit.getLocationById(5)));
        locationsKeys.put(3, new LocationKey(3, locationInit.getLocationById(6)));
        locationsKeys.put(4, new LocationKey(4, locationInit.getLocationById(15)));
        locationsKeys.put(5, new LocationKey(5, locationInit.getLocationById(8)));
        locationsKeys.put(6, new LocationKey(6, locationInit.getLocationById(10)));
        locationsKeys.put(7, new LocationKey(7, locationInit.getLocationById(13)));
        locationsKeys.put(8, new LocationKey(8, locationInit.getLocationById(12)));
        locationsKeys.put(9, new LocationKey(9, locationInit.getLocationById(14)));
    }

    public LocationKey getLocationKeyById(int locationKeyId) {
        return locationsKeys.get(locationKeyId);
    }
}
