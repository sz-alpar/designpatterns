package de.repeatuntil.designpatterns.creational.builder;

import de.repeatuntil.designpatterns.maze.*;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Alpar Szotyori on 2/24/17.
 */


public class BuilderTest {

    @Test
    public void standardMazeBuilder() throws Exception {
        MazeGame mazeGame = new MazeGame();
        MazeBuilder standardMazeBuilder = new StandardMazeBuilder();
        Maze maze = mazeGame.createMaze(standardMazeBuilder);
        assertIsStandardMaze(maze);
    }

    private void assertIsStandardMaze(Maze maze) {
        assertNotNull(maze.getRoomWithNumber(1));
        assertNotNull(maze.getRoomWithNumber(2));
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
    public void countingMazeBuilder() throws Exception {
        MazeGame mazeGame = new MazeGame();
        CountingMazeBuilder countingMazeBuilder = new CountingMazeBuilder();
        Maze maze = mazeGame.createMaze(countingMazeBuilder);
        assertNull(maze);
        assertEquals(2, countingMazeBuilder.getCounts().rooms);
        assertEquals(1, countingMazeBuilder.getCounts().doors);
    }
}
