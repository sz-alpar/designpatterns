package de.repeatuntil.designpatterns.creational.factorymethod;

import static de.repeatuntil.designpatterns.creational.TestUtils.assertHasBombedTypes;
import static de.repeatuntil.designpatterns.creational.TestUtils.assertHasDefaultTypes;
import static de.repeatuntil.designpatterns.creational.TestUtils.assertHasEnchantedTypes;

import org.junit.Test;

import de.repeatuntil.designpatterns.maze.Maze;

/**
 * Created by Alpar Szotyori on 2/24/17.
 */
public class FactoryMethodTest {

    @Test
    public void bombedMazeGame() throws Exception {
        final MazeGame mazeGame = new BombedMazeGame();
        final Maze maze = mazeGame.createMaze();
        assertHasBombedTypes(maze);
    }

    @Test
    public void defaultMazeGame() throws Exception {
        final MazeGame mazeGame = new MazeGame();
        final Maze maze = mazeGame.createMaze();
        assertHasDefaultTypes(maze);
    }

    @Test
    public void enchantedMazeGame() throws Exception {
        final MazeGame mazeGame = new EnchantedMazeGame();
        final Maze maze = mazeGame.createMaze();
        assertHasEnchantedTypes(maze);
    }

}
