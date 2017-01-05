package de.repeatuntil.designpatterns.creational.abstractfactory;

import de.repeatuntil.designpatterns.maze.Room;
import de.repeatuntil.designpatterns.maze.Wall;

/**
 * Created by Alpar Szotyori on 1/5/17.
 */
public class BombedMazeFactory extends MazeFactory {

    @Override
    public Room makeRoom(final int roomNumber) {
        return new RoomWithABomb(roomNumber);
    }

    @Override
    public Wall makeWall() {
        return new BombedWall();
    }
}
