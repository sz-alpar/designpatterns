package de.repeatuntil.designpatterns.creational.abstractfactory;

import org.jetbrains.annotations.NotNull;

import de.repeatuntil.designpatterns.maze.Door;
import de.repeatuntil.designpatterns.maze.Maze;
import de.repeatuntil.designpatterns.maze.Room;
import de.repeatuntil.designpatterns.maze.Wall;

/**
 * Created by Alpar Szotyori on 1/5/17.
 */
public class MazeFactory {

    @NotNull
    public Door makeDoor(@NotNull final Room r1, @NotNull final Room r2) {
        return new Door(r1, r2);
    }

    @NotNull
    public Maze makeMaze() {
        return new Maze();
    }

    @NotNull
    public Room makeRoom(final int roomNumber) {
        return new Room(roomNumber);
    }

    @NotNull
    public Wall makeWall() {
        return new Wall();
    }
}
