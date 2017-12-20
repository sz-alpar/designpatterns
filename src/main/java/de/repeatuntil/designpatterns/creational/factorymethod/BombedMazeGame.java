package de.repeatuntil.designpatterns.creational.factorymethod;

import org.jetbrains.annotations.NotNull;

import de.repeatuntil.designpatterns.creational.abstractfactory.BombedWall;
import de.repeatuntil.designpatterns.creational.abstractfactory.RoomWithABomb;
import de.repeatuntil.designpatterns.maze.Room;
import de.repeatuntil.designpatterns.maze.Wall;

/**
 * Created by Alpar Szotyori on 2/24/17.
 */
final class BombedMazeGame extends MazeGame {

    @NotNull
    @Override
    protected Room makeRoom(final int roomNr) {
        return new RoomWithABomb(roomNr);
    }

    @NotNull
    @Override
    protected Wall makeWall() {
        return new BombedWall();
    }
}
