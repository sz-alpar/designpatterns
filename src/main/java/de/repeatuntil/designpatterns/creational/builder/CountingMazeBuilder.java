package de.repeatuntil.designpatterns.creational.builder;

import org.jetbrains.annotations.NotNull;

import de.repeatuntil.designpatterns.maze.Direction;
import de.repeatuntil.designpatterns.maze.Maze;

/**
 * Created by Alpar Szotyori on 2/24/17.
 */
public final class CountingMazeBuilder implements MazeBuilder {

    private int doors;
    private int rooms;

    @Override
    public void buildDoor(final int roomFrom, @NotNull final Direction fromSide, final int roomTo,
            @NotNull final Direction toSide) {
        doors++;
    }

    @Override
    public void buildMaze() {

    }

    @Override
    public void buildRoom(final int roomNr) {
        rooms++;
    }

    @NotNull
    @Override
    public Maze getMaze() {
        return new Maze();
    }

    public Counts getCounts() {
        return new Counts(rooms, doors);
    }

    public static final class Counts {

        public final int doors;
        public final int rooms;

        public Counts(final int rooms, final int doors) {
            this.rooms = rooms;
            this.doors = doors;
        }
    }

}
