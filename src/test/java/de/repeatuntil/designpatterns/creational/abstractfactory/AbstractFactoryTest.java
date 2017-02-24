package de.repeatuntil.designpatterns.creational.abstractfactory;

import de.repeatuntil.designpatterns.creational.TestUtils;
import de.repeatuntil.designpatterns.maze.*;
import org.junit.Test;

import static de.repeatuntil.designpatterns.creational.TestUtils.*;
import static org.junit.Assert.*;

/**
 * Created by Alpar Szotyori on 1/5/17.
 */
public class AbstractFactoryTest {

    @Test
    public void defaultMazeFactory() throws Exception {
        MazeGame game = new MazeGame();
        Maze maze = game.createMaze(new MazeFactory());
        assertHasDefaultTypes(maze);
    }

    @Test
    public void enchantedMazeFactory() throws Exception {
        MazeGame game = new MazeGame();
        Maze maze = game.createMaze(new EnchantedMazeFactory());
        assertHasEnchantedTypes(maze);
    }

    @Test
    public void bombedMazeFactory() throws Exception {
        MazeGame game = new MazeGame();
        Maze maze = game.createMaze(new BombedMazeFactory());
        assertHasBombedTypes(maze);
    }

}