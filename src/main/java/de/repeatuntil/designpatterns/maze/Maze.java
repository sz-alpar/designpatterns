package de.repeatuntil.designpatterns.maze;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alpar Szotyori on 1/5/17.
 */
public final class Maze {

    private final Map<Integer, Room> rooms;

    private Maze(@NotNull final Maze other) {
        this();
        copyRooms(other);
    }

    public Maze() {
        this.rooms = new HashMap<>();
    }

    private void copyRooms(@NotNull final Maze other) {
        for (final Map.Entry<Integer, Room> entry : other.rooms.entrySet()) {
            this.rooms.put(entry.getKey(), (Room) entry.getValue().copy());
        }
    }

    public void addRoom(@NotNull final Room room) {
        this.rooms.put(room.getRoomNumber(), room);
    }

    public Maze copy() {
        return new Maze(this);
    }

    @NotNull
    public Room getRoomWithNumber(final int roomNumber) {
        final Room room = rooms.get(roomNumber);
        if (room == null) {
            throw new RoomNotFoundException(roomNumber);
        }
        return room;
    }

    @SuppressWarnings("unused")
    Map<Integer, Room> getRooms() {
        return rooms;
    }
}
