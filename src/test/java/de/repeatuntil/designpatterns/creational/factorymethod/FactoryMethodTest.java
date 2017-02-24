package de.repeatuntil.designpatterns.creational.factorymethod;

import de.repeatuntil.designpatterns.creational.abstractfactory.BombedWall;
import de.repeatuntil.designpatterns.creational.abstractfactory.DoorNeedingSpell;
import de.repeatuntil.designpatterns.creational.abstractfactory.EnchantedRoom;
import de.repeatuntil.designpatterns.creational.abstractfactory.RoomWithABomb;
import de.repeatuntil.designpatterns.maze.*;
import org.junit.Test;

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

    private void assertHasDefaultTypes(Maze maze) {
        assertTrue(maze.getRoomWithNumber(1) instanceof Room);
        assertTrue(maze.getRoomWithNumber(2) instanceof Room);
        assertTrue(maze.getRoomWithNumber(1).getSide(Direction.NORTH) instanceof Wall);
        assertTrue(maze.getRoomWithNumber(1).getSide(Direction.EAST) instanceof Door);
        assertTrue(maze.getRoomWithNumber(1).getSide(Direction.SOUTH) instanceof Wall);
        assertTrue(maze.getRoomWithNumber(1).getSide(Direction.WEST) instanceof Wall);
        assertTrue(maze.getRoomWithNumber(2).getSide(Direction.NORTH) instanceof Wall);
        assertTrue(maze.getRoomWithNumber(2).getSide(Direction.EAST) instanceof Wall);
        assertTrue(maze.getRoomWithNumber(2).getSide(Direction.SOUTH) instanceof Wall);
        assertTrue(maze.getRoomWithNumber(2).getSide(Direction.WEST) instanceof Door);
    }

    @Test
    public void bombedMazeGame() throws Exception {
        MazeGame mazeGame = new BombedMazeGame();
        Maze maze = mazeGame.createMaze();
        assertHasBombedTypes(maze);
    }

    private void assertHasBombedTypes(Maze maze) {
        assertTrue(maze.getRoomWithNumber(1) instanceof RoomWithABomb);
        assertTrue(maze.getRoomWithNumber(2) instanceof RoomWithABomb);
        assertTrue(maze.getRoomWithNumber(1).getSide(Direction.NORTH) instanceof BombedWall);
        assertTrue(maze.getRoomWithNumber(1).getSide(Direction.EAST) instanceof Door);
        assertTrue(maze.getRoomWithNumber(1).getSide(Direction.SOUTH) instanceof BombedWall);
        assertTrue(maze.getRoomWithNumber(1).getSide(Direction.WEST) instanceof BombedWall);
        assertTrue(maze.getRoomWithNumber(2).getSide(Direction.NORTH) instanceof BombedWall);
        assertTrue(maze.getRoomWithNumber(2).getSide(Direction.EAST) instanceof BombedWall);
        assertTrue(maze.getRoomWithNumber(2).getSide(Direction.SOUTH) instanceof BombedWall);
        assertTrue(maze.getRoomWithNumber(2).getSide(Direction.WEST) instanceof Door);
    }

    @Test
    public void enchantedMazeGame() throws Exception {
        MazeGame mazeGame = new EnchantedMazeGame();
        Maze maze = mazeGame.createMaze();
        assertHasEnchantedTypes(maze);
    }

    private void assertHasEnchantedTypes(Maze maze) {
        assertTrue(maze.getRoomWithNumber(1) instanceof EnchantedRoom);
        assertTrue(maze.getRoomWithNumber(2) instanceof EnchantedRoom);
        assertTrue(maze.getRoomWithNumber(1).getSide(Direction.NORTH) instanceof Wall);
        assertTrue(maze.getRoomWithNumber(1).getSide(Direction.EAST) instanceof DoorNeedingSpell);
        assertTrue(maze.getRoomWithNumber(1).getSide(Direction.SOUTH) instanceof Wall);
        assertTrue(maze.getRoomWithNumber(1).getSide(Direction.WEST) instanceof Wall);
        assertTrue(maze.getRoomWithNumber(2).getSide(Direction.NORTH) instanceof Wall);
        assertTrue(maze.getRoomWithNumber(2).getSide(Direction.EAST) instanceof Wall);
        assertTrue(maze.getRoomWithNumber(2).getSide(Direction.SOUTH) instanceof Wall);
        assertTrue(maze.getRoomWithNumber(2).getSide(Direction.WEST) instanceof DoorNeedingSpell);
    }
}
