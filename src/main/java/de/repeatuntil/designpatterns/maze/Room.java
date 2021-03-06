package de.repeatuntil.designpatterns.maze;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alpar Szotyori on 1/5/17.
 */
public class Room implements MapSite {

    private final Map<Direction, MapSite> sides;
    private int roomNumber;

    public Room() {
        this.sides = new HashMap<>();
    }

    protected Room(@NotNull final Room other) {
        this(other.roomNumber);
        copySides(other);
    }

    public Room(final int roomNumber) {
        this.roomNumber = roomNumber;
        this.sides = new HashMap<>();
    }

    private void copySides(final Room other) {
        for (final Map.Entry<Direction, MapSite> entry : other.sides.entrySet()) {
            sides.put(entry.getKey(), entry.getValue().copy());
        }
    }

    @NotNull
    @Override
    public MapSite copy() {
        return new Room(this);
    }

    @Override
    public void enter() {

    }

    public final int getRoomNumber() {
        return roomNumber;
    }

    @NotNull
    public final MapSite getSide(final Direction direction) {
        final MapSite side = sides.get(direction);
        if (side == null) {
            throw new SideNotFoundException(this, direction);
        }
        return side;
    }

    public final void initialize(final int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public final void setSide(final Direction direction, final MapSite site) {
        sides.put(direction, site);
    }

}
