package de.repeatuntil.designpatterns.creational.factorymethod;

import de.repeatuntil.designpatterns.creational.abstractfactory.BombedWall;
import de.repeatuntil.designpatterns.creational.abstractfactory.DoorNeedingSpell;
import de.repeatuntil.designpatterns.creational.abstractfactory.EnchantedRoom;
import de.repeatuntil.designpatterns.creational.abstractfactory.RoomWithABomb;
import de.repeatuntil.designpatterns.maze.*;
import org.junit.Test;

import static de.repeatuntil.designpatterns.creational.TestUtils.assertHasBombedTypes;
import static de.repeatuntil.designpatterns.creational.TestUtils.assertHasDefaultTypes;
import static de.repeatuntil.designpatterns.creational.TestUtils.assertHasEnchantedTypes;
import static org.junit.Assert.assertTrue;

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
