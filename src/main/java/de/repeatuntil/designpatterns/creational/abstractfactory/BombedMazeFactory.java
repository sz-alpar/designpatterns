package de.repeatuntil.designpatterns.creational.abstractfactory;

import org.jetbrains.annotations.NotNull;

import de.repeatuntil.designpatterns.maze.Room;
import de.repeatuntil.designpatterns.maze.Wall;

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
