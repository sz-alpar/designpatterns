package de.repeatuntil.designpatterns.creational.abstractfactory;

import org.jetbrains.annotations.NotNull;

import de.repeatuntil.designpatterns.maze.MapSite;
import de.repeatuntil.designpatterns.maze.Room;

/**
 * Created by Alpar Szotyori on 1/5/17.
 */
public final class RoomWithABomb extends Room {

    public RoomWithABomb() {
        super();
    }

    public RoomWithABomb(final int roomNumber) {
        super(roomNumber);
    }

    private RoomWithABomb(@NotNull final RoomWithABomb roomWithABomb) {
        super(roomWithABomb);
    }

    @NotNull
    @Override
    public MapSite copy() {
        return new RoomWithABomb(this);
    }
}
