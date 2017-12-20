package de.repeatuntil.designpatterns.creational.singleton;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

import java.util.HashMap;
import java.util.Map;

import de.repeatuntil.designpatterns.creational.abstractfactory.MazeFactory;
import de.repeatuntil.designpatterns.maze.Door;
import de.repeatuntil.designpatterns.maze.Maze;
import de.repeatuntil.designpatterns.maze.Room;
import de.repeatuntil.designpatterns.maze.Wall;

/**
 * Created by Alpar Szotyori on 2/25/17.
 */
public class MazeFactorySingletonSubclassingWithRegistry extends MazeFactory {

    private static final Map<String, MazeFactorySingletonSubclassingWithRegistry> REGISTRY =
            new HashMap<>();

    @SuppressWarnings("StaticNonFinalField")
    @TestOnly
    static MazeFactorySingletonSubclassingWithRegistry INSTANCE;

    MazeFactorySingletonSubclassingWithRegistry() {
    }

    @Override
    @NotNull
    public Door makeDoor(@NotNull final Room r1, @NotNull final Room r2) {
        return new Door(r1, r2);
    }

    @Override
    @NotNull
    public Maze makeMaze() {
        return new Maze();
    }

    @Override
    @NotNull
    public Room makeRoom(final int roomNumber) {
        return new Room(roomNumber);
    }

    @Override
    @NotNull
    public Wall makeWall() {
        return new Wall();
    }

    @NotNull
    static MazeFactorySingletonSubclassingWithRegistry getInstance() {
        if (INSTANCE == null) {
            final String mazeStyle = System.getProperty("maze.style");
            final MazeFactorySingletonSubclassingWithRegistry mazeFactory = lookup(mazeStyle);

            if (mazeFactory != null) {
                INSTANCE = mazeFactory;
            } else {
                INSTANCE = new MazeFactorySingletonSubclassingWithRegistry();
            }
        }
        return INSTANCE;
    }

    @Nullable
    private static MazeFactorySingletonSubclassingWithRegistry lookup(final String name) {
        return REGISTRY.get(name);
    }

    @SuppressWarnings("unused")
    static void registerSubclass(@NotNull final String name,
            @NotNull final MazeFactorySingletonSubclassingWithRegistry instance) {
        REGISTRY.put(name, instance);
    }
}
