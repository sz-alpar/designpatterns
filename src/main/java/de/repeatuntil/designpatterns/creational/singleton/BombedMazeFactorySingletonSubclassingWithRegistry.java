package de.repeatuntil.designpatterns.creational.singleton;

import org.jetbrains.annotations.NotNull;

import de.repeatuntil.designpatterns.creational.abstractfactory.BombedMazeFactory;
import de.repeatuntil.designpatterns.maze.Door;
import de.repeatuntil.designpatterns.maze.Maze;
import de.repeatuntil.designpatterns.maze.Room;
import de.repeatuntil.designpatterns.maze.Wall;

/**
 * Created by Alpar Szotyori on 2/25/17.
 */
public final class BombedMazeFactorySingletonSubclassingWithRegistry
        extends MazeFactorySingletonSubclassingWithRegistry {

    static {
        new BombedMazeFactorySingletonSubclassingWithRegistry();
    }

    private final BombedMazeFactory mazeFactory;

    private BombedMazeFactorySingletonSubclassingWithRegistry() {
        mazeFactory = new BombedMazeFactory();
        registerSubclass("bombed", this);
    }

    @SuppressWarnings("unused")
    @Override
    @NotNull
    public Door makeDoor(@NotNull final Room r1, @NotNull final Room r2) {
        return mazeFactory.makeDoor(r1, r2);
    }

    @SuppressWarnings("unused")
    @Override
    @NotNull
    public Maze makeMaze() {
        return mazeFactory.makeMaze();
    }

    @SuppressWarnings("unused")
    @Override
    @NotNull
    public Room makeRoom(final int roomNumber) {
        return mazeFactory.makeRoom(roomNumber);
    }

    @SuppressWarnings("unused")
    @Override
    @NotNull
    public Wall makeWall() {
        return mazeFactory.makeWall();
    }
}
