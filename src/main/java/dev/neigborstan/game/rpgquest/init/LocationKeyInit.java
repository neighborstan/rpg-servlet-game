package dev.neigborstan.game.rpgquest.init;

import dev.neigborstan.game.rpgquest.entity.Location;
import dev.neigborstan.game.rpgquest.entity.LocationKey;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

public class LocationKeyInit {
    @Getter
    private Map<Integer, LocationKey> locationsKeys = new HashMap<>();

    public LocationKeyInit(Map<Integer, Location> locations) {

        LocationKey kunszaliaKey = new LocationKey(1, locations.get(2));
        LocationKey olboreKey = new LocationKey(2, locations.get(5));
        LocationKey alfnirlandKey = new LocationKey(3, locations.get(6));
        LocationKey krismaaKey = new LocationKey(4, locations.get(15));
        LocationKey seirateliaKey = new LocationKey(5, locations.get(8));
        LocationKey abrenusKey = new LocationKey(6, locations.get(10));
        LocationKey nolahmaaKey = new LocationKey(7, locations.get(13));
        LocationKey anolariaKey = new LocationKey(8, locations.get(12));
        LocationKey akosiaaKey = new LocationKey(9, locations.get(14));

        locationsKeys.put(1, kunszaliaKey);
        locationsKeys.put(2, olboreKey);
        locationsKeys.put(3, alfnirlandKey);
        locationsKeys.put(4, krismaaKey);
        locationsKeys.put(5, seirateliaKey);
        locationsKeys.put(6, abrenusKey);
        locationsKeys.put(7, nolahmaaKey);
        locationsKeys.put(8, anolariaKey);
        locationsKeys.put(9, akosiaaKey);
    }
}
