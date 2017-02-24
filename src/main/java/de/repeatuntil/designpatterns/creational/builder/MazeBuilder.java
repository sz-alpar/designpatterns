package de.repeatuntil.designpatterns.creational.builder;

import de.repeatuntil.designpatterns.maze.Direction;
import de.repeatuntil.designpatterns.maze.Maze;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Alpar Szotyori on 2/24/17.
 */
public interface MazeBuilder {

    void buildMaze();

    void buildRoom(final int roomNr);

    void buildDoor(final int roomFrom, @NotNull final Direction fromSide, final int roomTo, @NotNull final Direction toSide);

    Maze getMaze();

}
