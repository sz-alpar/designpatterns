package de.repeatuntil.designpatterns.creational.builder;

import org.jetbrains.annotations.NotNull;

import de.repeatuntil.designpatterns.maze.Direction;
import de.repeatuntil.designpatterns.maze.Maze;

/**
 * Created by Alpar Szotyori on 2/24/17.
 */
interface MazeBuilder {

    void buildDoor(final int roomFrom, @NotNull final Direction fromSide, final int roomTo,
            @NotNull final Direction toSide);

    void buildMaze();

    void buildRoom(final int roomNr);

    @NotNull
    Maze getMaze();

}
