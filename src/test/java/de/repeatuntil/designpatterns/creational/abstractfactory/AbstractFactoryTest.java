package de.repeatuntil.designpatterns.creational.abstractfactory;

import static de.repeatuntil.designpatterns.creational.TestUtils.assertHasBombedTypes;
import static de.repeatuntil.designpatterns.creational.TestUtils.assertHasDefaultTypes;
import static de.repeatuntil.designpatterns.creational.TestUtils.assertHasEnchantedTypes;

import org.junit.Test;

import de.repeatuntil.designpatterns.maze.Maze;

/**
 * Created by Alpar Szotyori on 1/5/17.
 */
public class AbstractFactoryTest {

    @Test
    public void bombedMazeFactory() throws Exception {
        final MazeGame game = new MazeGame();
        final Maze maze = game.createMaze(new BombedMazeFactory());
        assertHasBombedTypes(maze);
    }

    @Test
    public void defaultMazeFactory() throws Exception {
        final MazeGame game = new MazeGame();
        final Maze maze = game.createMaze(new MazeFactory());
        assertHasDefaultTypes(maze);
    }

    @Test
    public void enchantedMazeFactory() throws Exception {
        final MazeGame game = new MazeGame();
        final Maze maze = game.createMaze(new EnchantedMazeFactory());
        assertHasEnchantedTypes(maze);
    }

}