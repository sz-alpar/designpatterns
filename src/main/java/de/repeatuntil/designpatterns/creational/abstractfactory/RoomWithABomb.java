package de.repeatuntil.designpatterns.creational.abstractfactory;

import de.repeatuntil.designpatterns.maze.MapSite;
import de.repeatuntil.designpatterns.maze.Room;
import org.jetbrains.annotations.NotNull;

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
