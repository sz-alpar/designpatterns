package de.repeatuntil.designpatterns.creational.factorymethod;

import de.repeatuntil.designpatterns.creational.abstractfactory.BombedWall;
import de.repeatuntil.designpatterns.creational.abstractfactory.RoomWithABomb;
import de.repeatuntil.designpatterns.maze.Room;
import de.repeatuntil.designpatterns.maze.Wall;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Alpar Szotyori on 2/24/17.
 */
public class BombedMazeGame extends MazeGame {

    @NotNull
    @Override
    protected Wall makeWall() {
        return new BombedWall();
    }

    @NotNull
    @Override
    protected Room makeRoom(final int roomNr) {
        return new RoomWithABomb(roomNr);
    }
}
