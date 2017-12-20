package de.repeatuntil.designpatterns.creational.singleton;

import static org.junit.Assert.assertSame;

import static de.repeatuntil.designpatterns.creational.TestUtils.assertHasBombedTypes;
import static de.repeatuntil.designpatterns.creational.TestUtils.assertHasDefaultTypes;
import static de.repeatuntil.designpatterns.creational.TestUtils.assertHasEnchantedTypes;

import org.junit.Before;
import org.junit.Test;

import de.repeatuntil.designpatterns.creational.abstractfactory.MazeGame;
import de.repeatuntil.designpatterns.maze.Maze;

/**
 * Created by Alpar Szotyori on 2/25/17.
 */
public class SingletonTest {

    @Test
    public void bombedMazeFactorySubclassing() throws Exception {
        System.setProperty("maze.style", "bombed");
        final MazeGame game = new MazeGame();
        final Maze maze = game.createMaze(MazeFactorySingletonSubclassing.getInstance());
        assertHasBombedTypes(maze);
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
        final Maze maze =
                game.createMaze(MazeFactorySingletonSubclassingWithRegistry.getInstance());
        assertHasBombedTypes(maze);
    }

    @Test
    public void defaultMazeFactorySubclassing() throws Exception {
        System.setProperty("maze.style", "");
        final MazeGame game = new MazeGame();
        final Maze maze = game.createMaze(MazeFactorySingletonSubclassing.getInstance());
        assertHasDefaultTypes(maze);
    }

    @Test
    public void defaultMazeFactorySubclassingWithRegistry() throws Exception {
        System.setProperty("maze.style", "");
        final MazeGame game = new MazeGame();
        final Maze maze =
                game.createMaze(MazeFactorySingletonSubclassingWithRegistry.getInstance());
        assertHasDefaultTypes(maze);
    }

    @Test
    public void enchantedMazeFactorySubclassing() throws Exception {
        System.setProperty("maze.style", "enchanted");
        final MazeGame game = new MazeGame();
        final Maze maze = game.createMaze(MazeFactorySingletonSubclassing.getInstance());
        assertHasEnchantedTypes(maze);
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
        final Maze maze =
                game.createMaze(MazeFactorySingletonSubclassingWithRegistry.getInstance());
        assertHasEnchantedTypes(maze);
    }

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
    public void singletonMazeFactoryDoubleCheckedLocking() throws Exception {
        final MazeFactorySingletonDoubleCheckedLocking singletonInstance1 =
                MazeFactorySingletonDoubleCheckedLocking
                        .getInstance();
        final MazeFactorySingletonDoubleCheckedLocking singletonInstance2 =
                MazeFactorySingletonDoubleCheckedLocking
                        .getInstance();
        assertSame(singletonInstance1, singletonInstance2);
    }

    @Test
    public void singletonMazeFactoryEnum() throws Exception {
        final MazeFactorySingletonEnum singletonInstance1 = MazeFactorySingletonEnum.INSTANCE;
        final MazeFactorySingletonEnum singletonInstance2 = MazeFactorySingletonEnum.INSTANCE;
        assertSame(singletonInstance1, singletonInstance2);
    }

    @Test
    public void singletonMazeFactoryInitOnDemand() throws Exception {
        final MazeFactorySingletonInitOnDemand singletonInstance1 =
                MazeFactorySingletonInitOnDemand.getInstance();
        final MazeFactorySingletonInitOnDemand singletonInstance2 =
                MazeFactorySingletonInitOnDemand.getInstance();
        assertSame(singletonInstance1, singletonInstance2);
    }

    @Test
    public void singletonMazeFactoryStaticInit() throws Exception {
        final MazeFactorySingletonStaticInit singletonInstance1 =
                MazeFactorySingletonStaticInit.getInstance();
        final MazeFactorySingletonStaticInit singletonInstance2 =
                MazeFactorySingletonStaticInit.getInstance();
        assertSame(singletonInstance1, singletonInstance2);
    }

    @Test
    public void subclassingMazeFactory() throws Exception {
        final MazeFactorySingletonSubclassing singletonInstance1 =
                MazeFactorySingletonSubclassing.getInstance();
        final MazeFactorySingletonSubclassing singletonInstance2 =
                MazeFactorySingletonSubclassing.getInstance();
        assertSame(singletonInstance1, singletonInstance2);
    }

    @Test
    public void subclassingMazeFactoryWithRegistry() throws Exception {
        final MazeFactorySingletonSubclassingWithRegistry singletonInstance1 =
                MazeFactorySingletonSubclassingWithRegistry
                        .getInstance();
        final MazeFactorySingletonSubclassingWithRegistry singletonInstance2 =
                MazeFactorySingletonSubclassingWithRegistry
                        .getInstance();
        assertSame(singletonInstance1, singletonInstance2);
    }

}
