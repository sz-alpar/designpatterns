package de.repeatuntil.designpatterns.creational.singleton;

import de.repeatuntil.designpatterns.creational.abstractfactory.MazeGame;
import de.repeatuntil.designpatterns.maze.Maze;
import org.junit.Before;
import org.junit.Test;

import static de.repeatuntil.designpatterns.creational.TestUtils.*;
import static org.junit.Assert.assertSame;

/**
 * Created by Alpar Szotyori on 2/25/17.
 */
public class SingletonTest {

    @Before
    public void setUp() throws Exception {
        MazeFactorySingletonSubclassing.INSTANCE = null;
        MazeFactorySingletonSubclassingWithRegistry.INSTANCE = null;
    }

    @Test
    public void singletonMazeFactory() throws Exception {
        final MazeFactorySingleton singletonInstance1 = MazeFactorySingleton.getInstance();
        final MazeFactorySingleton singletonInstance2 = MazeFactorySingleton.getInstance();
        assertSame(singletonInstance1, singletonInstance2);
    }

    @Test
    public void subclassingMazeFactory() throws Exception {
        final MazeFactorySingletonSubclassing singletonInstance1 = MazeFactorySingletonSubclassing.getInstance();
        final MazeFactorySingletonSubclassing singletonInstance2 = MazeFactorySingletonSubclassing.getInstance();
        assertSame(singletonInstance1, singletonInstance2);
    }

    @Test
    public void subclassingMazeFactoryWithRegistry() throws Exception {
        final MazeFactorySingletonSubclassingWithRegistry singletonInstance1 = MazeFactorySingletonSubclassingWithRegistry
                .getInstance();
        final MazeFactorySingletonSubclassingWithRegistry singletonInstance2 = MazeFactorySingletonSubclassingWithRegistry
                .getInstance();
        assertSame(singletonInstance1, singletonInstance2);
    }

    @Test
    public void defaultMazeFactorySubclassing() throws Exception {
        System.setProperty("maze.style", "");
        final MazeGame game = new MazeGame();
        final Maze maze = game.createMaze(MazeFactorySingletonSubclassing.getInstance());
        assertHasDefaultTypes(maze);
    }

    @Test
    public void enchantedMazeFactorySubclassing() throws Exception {
        System.setProperty("maze.style", "enchanted");
        final MazeGame game = new MazeGame();
        final Maze maze = game.createMaze(MazeFactorySingletonSubclassing.getInstance());
        assertHasEnchantedTypes(maze);
    }

    @Test
    public void bombedMazeFactorySubclassing() throws Exception {
        System.setProperty("maze.style", "bombed");
        final MazeGame game = new MazeGame();
        final Maze maze = game.createMaze(MazeFactorySingletonSubclassing.getInstance());
        assertHasBombedTypes(maze);
    }

    @Test
    public void defaultMazeFactorySubclassingWithRegistry() throws Exception {
        System.setProperty("maze.style", "");
        final MazeGame game = new MazeGame();
        final Maze maze = game.createMaze(MazeFactorySingletonSubclassingWithRegistry.getInstance());
        assertHasDefaultTypes(maze);
    }

    @SuppressWarnings("SpellCheckingInspection")
    @Test
    public void enchantedMazeFactorySubclassingWithRegistry() throws Exception {
        // Load the class to execute the its static initializer to get it registered (this could be done
        // in a configuration or initialization phase)
        Class.forName(
                "de.repeatuntil.designpatterns.creational.singleton.EnchantedMazeFactorySingletonSubclassingWithRegistry");
        System.setProperty("maze.style", "enchanted");
        final MazeGame game = new MazeGame();
        final Maze maze = game.createMaze(MazeFactorySingletonSubclassingWithRegistry.getInstance());
        assertHasEnchantedTypes(maze);
    }

    @SuppressWarnings("SpellCheckingInspection")
    @Test
    public void bombedMazeFactorySubclassingWithRegistry() throws Exception {
        // Load the class to execute the its static initializer to get it registered (this could be done
        // in a configuration or initialization phase)
        Class.forName(
                "de.repeatuntil.designpatterns.creational.singleton.BombedMazeFactorySingletonSubclassingWithRegistry");
        System.setProperty("maze.style", "bombed");
        final MazeGame game = new MazeGame();
        final Maze maze = game.createMaze(MazeFactorySingletonSubclassingWithRegistry.getInstance());
        assertHasBombedTypes(maze);
    }

}
