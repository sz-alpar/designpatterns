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
        MazeGame mazeGame = new MazeGame();
        Maze maze = mazeGame.createMaze();
        assertHasDefaultTypes(maze);
    }

    @Test
    public void bombedMazeGame() throws Exception {
        MazeGame mazeGame = new BombedMazeGame();
        Maze maze = mazeGame.createMaze();
        assertHasBombedTypes(maze);
    }

    @Test
    public void enchantedMazeGame() throws Exception {
        MazeGame mazeGame = new EnchantedMazeGame();
        Maze maze = mazeGame.createMaze();
        assertHasEnchantedTypes(maze);
    }

}
