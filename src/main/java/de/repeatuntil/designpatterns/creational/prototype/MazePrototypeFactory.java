package de.repeatuntil.designpatterns.creational.prototype;

import de.repeatuntil.designpatterns.creational.abstractfactory.MazeFactory;
import de.repeatuntil.designpatterns.maze.Door;
import de.repeatuntil.designpatterns.maze.Maze;
import de.repeatuntil.designpatterns.maze.Room;
import de.repeatuntil.designpatterns.maze.Wall;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Alpar Szotyori on 2/24/17.
 */
public final class MazePrototypeFactory extends MazeFactory {

    private final Maze prototypeMaze;
    private final Room prototypeRoom;
    private final Wall prototypeWall;
    private final Door prototypeDoor;

    public MazePrototypeFactory(@NotNull final Maze prototypeMaze,
                                @NotNull final Wall prototypeWall,
                                @NotNull final Room prototypeRoom,
                                @NotNull final Door prototypeDoor) {
        this.prototypeMaze = prototypeMaze;
        this.prototypeWall = prototypeWall;
        this.prototypeRoom = prototypeRoom;
        this.prototypeDoor = prototypeDoor;
    }

    @NotNull
    @Override
    public Maze makeMaze() {
        return prototypeMaze.copy();
    }

    @NotNull
    @Override
    public Wall makeWall() {
        return (Wall) prototypeWall.copy();
    }

    @NotNull
    @Override
    public Room makeRoom(final int roomNumber) {
        final Room room = (Room) prototypeRoom.copy();
        room.initialize(roomNumber);
        return room;
    }

    @NotNull
    @Override
    public Door makeDoor(final Room r1, final Room r2) {
        final Door door = (Door) prototypeDoor.copy();
        door.initialize(r1, r2, false);
        return door;
    }
}
