package de.repeatuntil.designpatterns.creational.builder;

import de.repeatuntil.designpatterns.maze.Direction;
import de.repeatuntil.designpatterns.maze.Maze;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Alpar Szotyori on 1/5/17.
 */
final class MazeGame {

    public Maze createMaze(@NotNull final MazeBuilder builder) {
        builder.buildMaze();

        builder.buildRoom(1);
        builder.buildRoom(2);
        builder.buildDoor(1, Direction.EAST, 2, Direction.WEST);

        return builder.getMaze();
    }
}
