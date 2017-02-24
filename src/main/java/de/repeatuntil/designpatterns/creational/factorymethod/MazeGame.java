package de.repeatuntil.designpatterns.creational.factorymethod;

import de.repeatuntil.designpatterns.maze.*;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Alpar Szotyori on 1/5/17.
 */
public class MazeGame {

    public Maze createMaze() {
        final Maze maze = makeMaze();

        final Room r1 = makeRoom(1);
        final Room r2 = makeRoom(2);
        final Door theDoor = makeDoor(r1, r2);

        maze.addRoom(r1);
        maze.addRoom(r2);

        r1.setSide(Direction.NORTH, makeWall());
        r1.setSide(Direction.EAST, theDoor);
        r1.setSide(Direction.SOUTH, makeWall());
        r1.setSide(Direction.WEST, makeWall());

        r2.setSide(Direction.NORTH, makeWall());
        r2.setSide(Direction.EAST, makeWall());
        r2.setSide(Direction.SOUTH, makeWall());
        r2.setSide(Direction.WEST, theDoor);

        return maze;
    }

    @NotNull
    protected Maze makeMaze() {
        return new Maze();
    }

    @NotNull
    protected Room makeRoom(final int roomNr) {
        return new Room(roomNr);
    }

    @NotNull
    protected Door makeDoor(@NotNull final Room roomFrom, @NotNull final Room roomTo) {
        return new Door(roomFrom, roomTo);
    }

    @NotNull
    protected Wall makeWall() {
        return new Wall();
    }
}
