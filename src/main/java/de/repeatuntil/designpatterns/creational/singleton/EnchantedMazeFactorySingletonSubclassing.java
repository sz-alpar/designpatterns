package de.repeatuntil.designpatterns.creational.singleton;

import de.repeatuntil.designpatterns.creational.abstractfactory.EnchantedMazeFactory;
import de.repeatuntil.designpatterns.maze.Door;
import de.repeatuntil.designpatterns.maze.Maze;
import de.repeatuntil.designpatterns.maze.Room;
import de.repeatuntil.designpatterns.maze.Wall;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Alpar Szotyori on 2/25/17.
 */
public final class EnchantedMazeFactorySingletonSubclassing extends MazeFactorySingletonSubclassing {

    private final EnchantedMazeFactory mazeFactory;

    EnchantedMazeFactorySingletonSubclassing() {
        mazeFactory = new EnchantedMazeFactory();
    }

    @Override
    @NotNull
    public Maze makeMaze() {
        return mazeFactory.makeMaze();
    }

    @Override
    @NotNull
    public Wall makeWall() {
        return mazeFactory.makeWall();
    }

    @Override
    @NotNull
    public Room makeRoom(final int roomNumber) {
        return mazeFactory.makeRoom(roomNumber);
    }

    @Override
    @NotNull
    public Door makeDoor(@NotNull final Room r1, @NotNull final Room r2) {
        return mazeFactory.makeDoor(r1, r2);
    }
}
