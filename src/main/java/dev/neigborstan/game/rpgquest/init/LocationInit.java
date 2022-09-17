package dev.neigborstan.game.rpgquest.init;

import dev.neigborstan.game.rpgquest.entity.Location;
import lombok.Getter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LocationInit {
    private final Map<Integer, Location> locations = new HashMap<>();

    public LocationInit() {

        Location chamoia = new Location(1, "Chamoia", false);
        Location kunszalia = new Location(2, "Kunszalia", true);
        Location nyirmisia = new Location(3, "Nyirmisia", false);
        Location freitileria = new Location(4, "Freitileria", false);
        Location olbore = new Location(5, "Olbore", true);
        Location alfnirland = new Location(6, "Alfnirland", true);
        Location holunland = new Location(7, "Holunland", false);
        Location seiratelia = new Location(8, "Seiratelia", true);
        Location dagalhia = new Location(9, "Dagalhia", false);
        Location abrenus = new Location(10, "Abrenus", true);
        Location thesia = new Location(11, "Thesia", false);
        Location anolaria = new Location(12, "Anolaria", true);
        Location nolahmaa = new Location(13, "Nolahmaa", true);
        Location akosia = new Location(14, "Akosia", true);
        Location krismaa = new Location(15, "Krismaa", true);

        chamoia.getLocationsForMovement().addAll(Arrays.asList(freitileria, alfnirland, kunszalia));
        kunszalia.getLocationsForMovement().addAll(Arrays.asList(chamoia, alfnirland, nyirmisia));
        nyirmisia.getLocationsForMovement().addAll(Arrays.asList(kunszalia, abrenus));
        freitileria.getLocationsForMovement().addAll(Arrays.asList(chamoia, alfnirland, olbore));
        olbore.getLocationsForMovement().addAll(Arrays.asList(freitileria, alfnirland));
        alfnirland.getLocationsForMovement().addAll(Arrays.asList(olbore, freitileria, chamoia, kunszalia, holunland));
        holunland.getLocationsForMovement().add(alfnirland);
        seiratelia.getLocationsForMovement().addAll(Arrays.asList(dagalhia, abrenus));
        dagalhia.getLocationsForMovement().addAll(Arrays.asList(seiratelia, abrenus));
        abrenus.getLocationsForMovement().addAll(Arrays.asList(dagalhia, seiratelia, thesia, nolahmaa));
        thesia.getLocationsForMovement().add(abrenus);
        anolaria.getLocationsForMovement().addAll(Arrays.asList(akosia, nolahmaa));
        nolahmaa.getLocationsForMovement().addAll(Arrays.asList(anolaria, abrenus, krismaa));
        akosia.getLocationsForMovement().add(anolaria);
        krismaa.getLocationsForMovement().add(nolahmaa);

        locations.put(1, chamoia);
        locations.put(2, kunszalia);
        locations.put(3, nyirmisia);
        locations.put(4, freitileria);
        locations.put(5, olbore);
        locations.put(6, alfnirland);
        locations.put(7, holunland);
        locations.put(8, seiratelia);
        locations.put(9, dagalhia);
        locations.put(10, abrenus);
        locations.put(11, thesia);
        locations.put(12, anolaria);
        locations.put(13, nolahmaa);
        locations.put(14, akosia);
        locations.put(15, krismaa);
    }

    public Location getLocationById(int locationId){
        return locations.get(locationId);
    }
}
