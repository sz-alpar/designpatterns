package de.repeatuntil.designpatterns.creational.abstractfactory;

import de.repeatuntil.designpatterns.maze.Room;
import de.repeatuntil.designpatterns.maze.Wall;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Alpar Szotyori on 1/5/17.
 */
public final class BombedMazeFactory extends MazeFactory {

    @NotNull
    @Override
    public Room makeRoom(final int roomNumber) {
        return new RoomWithABomb(roomNumber);
    }

    @NotNull
    @Override
    public Wall makeWall() {
        return new BombedWall();
    }
}
