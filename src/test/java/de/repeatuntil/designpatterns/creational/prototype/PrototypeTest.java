package de.repeatuntil.designpatterns.creational.prototype;

import de.repeatuntil.designpatterns.creational.abstractfactory.*;
import de.repeatuntil.designpatterns.maze.Door;
import de.repeatuntil.designpatterns.maze.Maze;
import de.repeatuntil.designpatterns.maze.Room;
import de.repeatuntil.designpatterns.maze.Wall;
import org.junit.Test;

import static de.repeatuntil.designpatterns.creational.TestUtils.*;

/**
 * Created by Alpar Szotyori on 2/24/17.
 */
public class PrototypeTest {

    @Test
    public void simpleMazeFactory() throws Exception {
        final MazeGame mazeGame = new MazeGame();
        final MazePrototypeFactory simpleMazeFactory = new MazePrototypeFactory(new Maze(), new Wall(), new Room(),
                                                                                new Door());
        final Maze maze = mazeGame.createMaze(simpleMazeFactory);
        assertHasDefaultTypes(maze);
    }

    @Test
    public void bombedMazeFactory() throws Exception {
        final MazeGame mazeGame = new MazeGame();
        final MazePrototypeFactory bombedMazeFactory = new MazePrototypeFactory(new Maze(), new BombedWall(),
                                                                                new RoomWithABomb(), new Door());
        final Maze maze = mazeGame.createMaze(bombedMazeFactory);
        assertHasBombedTypes(maze);
    }

    @Test
    public void enchantedMazeFactory() throws Exception {
        final MazeGame mazeGame = new MazeGame();
        final MazePrototypeFactory enchantedMazeFactory = new MazePrototypeFactory(new Maze(), new Wall(),
                                                                                   new EnchantedRoom(),
                                                                                   new DoorNeedingSpell());
        final Maze maze = mazeGame.createMaze(enchantedMazeFactory);
        assertHasEnchantedTypes(maze);
    }
}
