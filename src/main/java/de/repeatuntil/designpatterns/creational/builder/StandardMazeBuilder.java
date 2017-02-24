package de.repeatuntil.designpatterns.creational.builder;

import de.repeatuntil.designpatterns.maze.*;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Alpar Szotyori on 2/24/17.
 */
public class StandardMazeBuilder implements MazeBuilder {

    private Maze currentMaze;

    @Override
    public void buildMaze() {
        currentMaze = new Maze();
    }

    @Override
    public void buildRoom(final int roomNr) {
        checkMazeInstance();
        if (roomNumberIsAvailable(roomNr)) {
            final Room room = new Room(roomNr);
            currentMaze.addRoom(room);

            room.setSide(Direction.NORTH, new Wall());
            room.setSide(Direction.SOUTH, new Wall());
            room.setSide(Direction.EAST, new Wall());
            room.setSide(Direction.WEST, new Wall());
        }
    }

    private void checkMazeInstance() {
        if (currentMaze == null) {
            throw new MazeNotCreatedException();
        }
    }

    private boolean roomNumberIsAvailable(final int roomNr) {
        try {
            currentMaze.getRoomWithNumber(roomNr);
            return false;
        } catch (final RoomNotFoundException ignored) {
            return true;
        }
    }

    @Override
    public void buildDoor(final int roomFrom, @NotNull final Direction fromSide, final int roomTo,
                          @NotNull final Direction toSide) {
        final Room r1 = currentMaze.getRoomWithNumber(roomFrom);
        final Room r2 = currentMaze.getRoomWithNumber(roomTo);
        final Door d = new Door(r1, r2);

        r1.setSide(fromSide, d);
        r2.setSide(toSide, d);
    }

    @NotNull
    @Override
    public Maze getMaze() {
        return currentMaze;
    }
}
