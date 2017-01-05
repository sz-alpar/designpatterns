package de.repeatuntil.designpatterns.creational.abstractfactory;

import de.repeatuntil.designpatterns.maze.*;

/**
 * Created by Alpar Szotyori on 1/5/17.
 */
public class MazeGame {

    public Maze createMaze(MazeFactory factory) {
        final Maze maze = factory.makeMaze();
        final Room r1 = factory.makeRoom(1);
        final Room r2 = factory.makeRoom(2);
        final Door door = factory.makeDoor(r1, r2);

        maze.addRoom(r1);
        maze.addRoom(r2);

        r1.setSide(Direction.NORTH, factory.makeWall());
        r1.setSide(Direction.EAST, door);
        r1.setSide(Direction.SOUTH, factory.makeWall());
        r1.setSide(Direction.WEST, factory.makeWall());

        r2.setSide(Direction.NORTH, factory.makeWall());
        r2.setSide(Direction.EAST, factory.makeWall());
        r2.setSide(Direction.SOUTH, factory.makeWall());
        r2.setSide(Direction.WEST, door);

        return maze;
    }
}
