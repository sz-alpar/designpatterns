package de.repeatuntil.designpatterns.creational.builder;

import static org.junit.Assert.assertEquals;

import static de.repeatuntil.designpatterns.creational.TestUtils.assertHasDefaultTypes;

import org.junit.Test;

import de.repeatuntil.designpatterns.maze.Maze;

/**
 * Created by Alpar Szotyori on 2/24/17.
 */

public class BuilderTest {

    @Test
    public void countingMazeBuilder() throws Exception {
        final MazeGame mazeGame = new MazeGame();
        final CountingMazeBuilder countingMazeBuilder = new CountingMazeBuilder();
        final Maze maze = mazeGame.createMaze(countingMazeBuilder);
        assertEquals(2, countingMazeBuilder.getCounts().rooms);
        assertEquals(1, countingMazeBuilder.getCounts().doors);
    }

    @Test
    public void standardMazeBuilder() throws Exception {
        final MazeGame mazeGame = new MazeGame();
        final MazeBuilder standardMazeBuilder = new StandardMazeBuilder();
        final Maze maze = mazeGame.createMaze(standardMazeBuilder);
        assertHasDefaultTypes(maze);
    }
}
