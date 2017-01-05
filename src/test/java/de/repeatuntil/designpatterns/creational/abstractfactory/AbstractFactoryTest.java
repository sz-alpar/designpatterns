package de.repeatuntil.designpatterns.creational.abstractfactory;

import de.repeatuntil.designpatterns.maze.*;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Alpar Szotyori on 1/5/17.
 */
public class AbstractFactoryTest {

    @Test
    public void defaultMazeFactory() throws Exception {
        MazeGame game = new MazeGame();
        Maze maze = game.createMaze(new MazeFactory());
        assertHasDefaultMazeFactoryTypes(maze);
    }

    @Test
    public void enchantedMazeFactory() throws Exception {
        MazeGame game = new MazeGame();
        Maze maze = game.createMaze(new EnchantedMazeFactory());
        assertHasEnchantedMazeFactoryTypes(maze);
    }

    @Test
    public void bombedMazeFactory() throws Exception {
        MazeGame game = new MazeGame();
        Maze maze = game.createMaze(new BombedMazeFactory());
        assertHasBombedMazeFactoryTypes(maze);
    }

    private void assertHasDefaultMazeFactoryTypes(Maze maze) {
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

    private void assertHasEnchantedMazeFactoryTypes(Maze maze) {
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

    private void assertHasBombedMazeFactoryTypes(Maze maze) {
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

}