package de.repeatuntil.designpatterns.maze;

/**
 * Created by Alpar Szotyori on 1/5/17.
 */
public class MazeGame {

    public Maze createMaze() {
        final Maze maze = new Maze();
        final Room r1 = new Room(1);
        final Room r2 = new Room(2);
        final Door door = new Door(r1, r2);

        maze.addRoom(r1);
        maze.addRoom(r2);

        r1.setSide(Direction.NORTH, new Wall());
        r1.setSide(Direction.EAST, door);
        r1.setSide(Direction.SOUTH, new Wall());
        r1.setSide(Direction.WEST, new Wall());

        r2.setSide(Direction.NORTH, new Wall());
        r2.setSide(Direction.EAST, new Wall());
        r2.setSide(Direction.SOUTH, new Wall());
        r2.setSide(Direction.WEST, door);

        return maze;
    }

}
