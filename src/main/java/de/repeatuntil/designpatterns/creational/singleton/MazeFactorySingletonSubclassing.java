package de.repeatuntil.designpatterns.creational.singleton;

import de.repeatuntil.designpatterns.creational.abstractfactory.MazeFactory;
import de.repeatuntil.designpatterns.maze.Door;
import de.repeatuntil.designpatterns.maze.Maze;
import de.repeatuntil.designpatterns.maze.Room;
import de.repeatuntil.designpatterns.maze.Wall;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.TestOnly;

/**
 * Created by Alpar Szotyori on 2/25/17.
 */
public class MazeFactorySingletonSubclassing extends MazeFactory {

    @SuppressWarnings("StaticNonFinalField")
    @TestOnly
    static MazeFactorySingletonSubclassing INSTANCE = null;

    MazeFactorySingletonSubclassing() {
    }

    @NotNull
    static MazeFactorySingletonSubclassing getInstance() {
        if (INSTANCE == null) {
            final String mazeStyle = System.getProperty("maze.style");

            if ("bombed".equals(mazeStyle)) {
                INSTANCE = new BombedMazeFactorySingletonSubclassing();
            } else if ("enchanted".equals(mazeStyle)) {
                INSTANCE = new EnchantedMazeFactorySingletonSubclassing();
            } else {
                INSTANCE = new MazeFactorySingletonSubclassing();
            }
        }
        return INSTANCE;
    }

    @Override
    @NotNull
    public Maze makeMaze() {
        return new Maze();
    }

    @Override
    @NotNull
    public Wall makeWall() {
        return new Wall();
    }

    @Override
    @NotNull
    public Room makeRoom(final int roomNumber) {
        return new Room(roomNumber);
    }

    @Override
    @NotNull
    public Door makeDoor(@NotNull final Room r1, @NotNull final Room r2) {
        return new Door(r1, r2);
    }
}
