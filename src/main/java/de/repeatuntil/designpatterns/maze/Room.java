package de.repeatuntil.designpatterns.maze;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alpar Szotyori on 1/5/17.
 */
public class Room implements MapSite {

    private final int roomNumber;
    private final Map<Direction, MapSite> sides;

    public Room(final int roomNumber) {
        this.roomNumber = roomNumber;
        this.sides = new HashMap<>();
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    @NotNull
    public MapSite getSide(final Direction direction) {
        final MapSite side = sides.get(direction);
        if (side == null) {
            throw new SideNotFoundException(this, direction);
        }
        return side;
    }

    public void setSide(final Direction direction, final MapSite site) {
        sides.put(direction, site);
    }

    @Override
    public void enter() {

    }

}
