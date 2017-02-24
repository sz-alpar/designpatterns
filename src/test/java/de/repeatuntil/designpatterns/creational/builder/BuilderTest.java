package de.repeatuntil.designpatterns.creational.builder;

import de.repeatuntil.designpatterns.creational.TestUtils;
import de.repeatuntil.designpatterns.maze.*;
import org.junit.Test;

import static de.repeatuntil.designpatterns.creational.TestUtils.*;
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
        assertHasDefaultTypes(maze);
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
