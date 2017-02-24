package de.repeatuntil.designpatterns.creational.builder;

import de.repeatuntil.designpatterns.maze.Direction;
import de.repeatuntil.designpatterns.maze.Maze;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Alpar Szotyori on 2/24/17.
 */
public class CountingMazeBuilder implements MazeBuilder {

    private int doors;
    private int rooms;

    @Override
    public void buildMaze() {

    }

    @Override
    public void buildRoom(final int roomNr) {
        rooms++;
    }

    @Override
    public void buildDoor(final int roomFrom, @NotNull final Direction fromSide, final int roomTo,
                          @NotNull final Direction toSide) {
        doors++;
    }

    @NotNull
    @Override
    public Maze getMaze() {
        return new Maze();
    }

    public Counts getCounts() {
        return new Counts(rooms, doors);
    }

    public class Counts {

        public final int rooms;
        public final int doors;

        public Counts(final int rooms, final int doors) {
            this.rooms = rooms;
            this.doors = doors;
        }
    }

}
