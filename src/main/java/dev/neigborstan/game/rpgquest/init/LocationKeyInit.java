package dev.neigborstan.game.rpgquest.init;

import dev.neigborstan.game.rpgquest.entity.Location;
import dev.neigborstan.game.rpgquest.entity.LocationKey;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

public class LocationKeyInit {
    private Map<Integer, LocationKey> locationsKeys = new HashMap<>();

    public LocationKeyInit(LocationInit locationInit) {

        LocationKey kunszaliaKey = new LocationKey(1, locationInit.getLocationById(2));
        LocationKey olboreKey = new LocationKey(2, locationInit.getLocationById(5));
        LocationKey alfnirlandKey = new LocationKey(3, locationInit.getLocationById(6));
        LocationKey krismaaKey = new LocationKey(4, locationInit.getLocationById(15));
        LocationKey seirateliaKey = new LocationKey(5, locationInit.getLocationById(8));
        LocationKey abrenusKey = new LocationKey(6, locationInit.getLocationById(10));
        LocationKey nolahmaaKey = new LocationKey(7, locationInit.getLocationById(13));
        LocationKey anolariaKey = new LocationKey(8, locationInit.getLocationById(12));
        LocationKey akosiaaKey = new LocationKey(9, locationInit.getLocationById(14));

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

    public LocationKey getLocationKeyById(int locationKeyId){
        return locationsKeys.get(locationKeyId);
    }
}
