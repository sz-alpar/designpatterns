package de.repeatuntil.designpatterns.creational.builder;

import de.repeatuntil.designpatterns.maze.Maze;
import org.junit.Test;

import static de.repeatuntil.designpatterns.creational.TestUtils.assertHasDefaultTypes;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

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
        assertEquals(2, countingMazeBuilder.getCounts().rooms);
        assertEquals(1, countingMazeBuilder.getCounts().doors);
    }
}
