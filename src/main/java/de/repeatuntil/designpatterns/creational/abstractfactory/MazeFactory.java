package de.repeatuntil.designpatterns.creational.abstractfactory;

import de.repeatuntil.designpatterns.maze.Door;
import de.repeatuntil.designpatterns.maze.Maze;
import de.repeatuntil.designpatterns.maze.Room;
import de.repeatuntil.designpatterns.maze.Wall;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Alpar Szotyori on 1/5/17.
 */
public class MazeFactory {

    @NotNull
    public Maze makeMaze() {
        return new Maze();
    }

    @NotNull
    public Wall makeWall() {
        return new Wall();
    }

    @NotNull
    public Room makeRoom(final int roomNumber) {
        return new Room(roomNumber);
    }

    @NotNull
    public Door makeDoor(final Room r1, final Room r2) {
        return new Door(r1, r2);
    }
}
