package de.repeatuntil.designpatterns.maze;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Alpar Szotyori on 1/5/17.
 */
public class MazeGameTest {

    @Test
    public void createMaze() throws Exception {
        MazeGame game = new MazeGame();
        Maze maze = game.createMaze();
        assertIsCorrectMaze(maze);
    }

    private void assertIsCorrectMaze(Maze maze) {
        Room room1 = maze.getRoomWithNumber(1);
        assertNotNull(room1);
        Room room2 = maze.getRoomWithNumber(2);
        assertNotNull(room2);
        assertTrue(room1.getSide(Direction.NORTH) instanceof Wall);
        assertTrue(room1.getSide(Direction.EAST) instanceof Door);
        assertTrue(room1.getSide(Direction.SOUTH) instanceof Wall);
        assertTrue(room1.getSide(Direction.WEST) instanceof Wall);
        assertTrue(room2.getSide(Direction.NORTH) instanceof Wall);
        assertTrue(room2.getSide(Direction.EAST) instanceof Wall);
        assertTrue(room2.getSide(Direction.SOUTH) instanceof Wall);
        assertTrue(room2.getSide(Direction.WEST) instanceof Door);
        Door door = (Door) room1.getSide(Direction.EAST);
        assertEquals(door.otherSideFrom(room1), room2);
        door = (Door) room2.getSide(Direction.WEST);
        assertEquals(door.otherSideFrom(room2), room1);
    }

}