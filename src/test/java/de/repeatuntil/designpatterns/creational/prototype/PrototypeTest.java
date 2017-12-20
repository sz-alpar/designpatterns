package de.repeatuntil.designpatterns.creational.prototype;

import static de.repeatuntil.designpatterns.creational.TestUtils.assertHasBombedTypes;
import static de.repeatuntil.designpatterns.creational.TestUtils.assertHasDefaultTypes;
import static de.repeatuntil.designpatterns.creational.TestUtils.assertHasEnchantedTypes;

import org.junit.Test;

import de.repeatuntil.designpatterns.creational.abstractfactory.BombedWall;
import de.repeatuntil.designpatterns.creational.abstractfactory.DoorNeedingSpell;
import de.repeatuntil.designpatterns.creational.abstractfactory.EnchantedRoom;
import de.repeatuntil.designpatterns.creational.abstractfactory.MazeGame;
import de.repeatuntil.designpatterns.creational.abstractfactory.RoomWithABomb;
import de.repeatuntil.designpatterns.maze.Door;
import de.repeatuntil.designpatterns.maze.Maze;
import de.repeatuntil.designpatterns.maze.Room;
import de.repeatuntil.designpatterns.maze.Wall;

/**
 * Created by Alpar Szotyori on 2/24/17.
 */
public class PrototypeTest {

    @Test
    public void bombedMazeFactory() throws Exception {
        final MazeGame mazeGame = new MazeGame();
        final MazePrototypeFactory bombedMazeFactory =
                new MazePrototypeFactory(new Maze(), new BombedWall(),
                        new RoomWithABomb(), new Door());
        final Maze maze = mazeGame.createMaze(bombedMazeFactory);
        assertHasBombedTypes(maze);
    }

    @Test
    public void enchantedMazeFactory() throws Exception {
        final MazeGame mazeGame = new MazeGame();
        final MazePrototypeFactory enchantedMazeFactory =
                new MazePrototypeFactory(new Maze(), new Wall(),
                        new EnchantedRoom(),
                        new DoorNeedingSpell());
        final Maze maze = mazeGame.createMaze(enchantedMazeFactory);
        assertHasEnchantedTypes(maze);
    }

    @Test
    public void simpleMazeFactory() throws Exception {
        final MazeGame mazeGame = new MazeGame();
        final MazePrototypeFactory simpleMazeFactory =
                new MazePrototypeFactory(new Maze(), new Wall(), new Room(),
                        new Door());
        final Maze maze = mazeGame.createMaze(simpleMazeFactory);
        assertHasDefaultTypes(maze);
    }
}
