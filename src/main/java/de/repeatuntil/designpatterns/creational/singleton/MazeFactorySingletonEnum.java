package de.repeatuntil.designpatterns.creational.singleton;

import de.repeatuntil.designpatterns.creational.abstractfactory.MazeFactory;
import de.repeatuntil.designpatterns.maze.Door;
import de.repeatuntil.designpatterns.maze.Maze;
import de.repeatuntil.designpatterns.maze.Room;
import de.repeatuntil.designpatterns.maze.Wall;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Alpar Szotyori on 2/25/17.
 */
enum MazeFactorySingletonEnum {
    INSTANCE;

    private final MazeFactory mazeFactory;

    MazeFactorySingletonEnum() {
        mazeFactory = new MazeFactory();
    }

    @SuppressWarnings("unused")
    @NotNull
    public Maze makeMaze() {
        return mazeFactory.makeMaze();
    }

    @SuppressWarnings("unused")
    @NotNull
    public Wall makeWall() {
        return mazeFactory.makeWall();
    }

    @SuppressWarnings("unused")
    @NotNull
    public Room makeRoom(final int roomNumber) {
        return mazeFactory.makeRoom(roomNumber);
    }

    @SuppressWarnings("unused")
    @NotNull
    public Door makeDoor(@NotNull final Room r1, @NotNull final Room r2) {
        return mazeFactory.makeDoor(r1, r2);
    }

}
