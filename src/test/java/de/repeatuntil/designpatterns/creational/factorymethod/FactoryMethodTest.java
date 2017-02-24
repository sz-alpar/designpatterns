package de.repeatuntil.designpatterns.creational.factorymethod;

import de.repeatuntil.designpatterns.maze.Maze;
import org.junit.Test;

import static de.repeatuntil.designpatterns.creational.TestUtils.*;

/**
 * Created by Alpar Szotyori on 2/24/17.
 */
public class FactoryMethodTest {

    @Test
    public void defaultMazeGame() throws Exception {
        final MazeGame mazeGame = new MazeGame();
        final Maze maze = mazeGame.createMaze();
        assertHasDefaultTypes(maze);
    }

    @Test
    public void bombedMazeGame() throws Exception {
        final MazeGame mazeGame = new BombedMazeGame();
        final Maze maze = mazeGame.createMaze();
        assertHasBombedTypes(maze);
    }

    @Test
    public void enchantedMazeGame() throws Exception {
        final MazeGame mazeGame = new EnchantedMazeGame();
        final Maze maze = mazeGame.createMaze();
        assertHasEnchantedTypes(maze);
    }

}
