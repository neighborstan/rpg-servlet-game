package dev.neigborstan.game.rpgquest.repository;

import dev.neigborstan.game.rpgquest.entity.Location;
import dev.neigborstan.game.rpgquest.init.LocationInit;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class LocationRepoTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    void getLocationByIdDefault(int locationId) {
        List<Location> locations = new ArrayList<>();

        IntStream.rangeClosed(1, 5)
                .forEach((num) -> locations.add(new Location(num, "text" + num, false)));

        LocationInit locationInit = new LocationInit();
        LocationRepo locationRepo = new LocationRepo(locationInit);
        for (Location location : locations) {
            locationRepo.save(location.getId(), location);
        }

        Location expected = locationInit.getLocations().stream()
                .filter(userLocation -> userLocation.getId() == locationId)
                .findFirst()
                .get();

        Location actual = locationRepo.getLocationById(locationId);

        assertEquals(expected, actual);
    }
}