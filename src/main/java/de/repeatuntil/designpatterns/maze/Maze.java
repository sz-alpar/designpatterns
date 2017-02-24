package de.repeatuntil.designpatterns.maze;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alpar Szotyori on 1/5/17.
 */
public class Maze {

    private final Map<Integer, Room> rooms;

    public Maze() {
        this.rooms = new HashMap<>();
    }

    public Maze(@NotNull final Maze other) {
        this();
        copyRooms(other);
    }

    private void copyRooms(@NotNull final Maze other) {
        for (Map.Entry<Integer, Room> entry : other.rooms.entrySet()) {
            this.rooms.put(entry.getKey(), (Room) entry.getValue().copy());
        }
    }

    public void addRoom(@NotNull final Room room) {
        this.rooms.put(room.getRoomNumber(), room);
    }

    @NotNull
    public Room getRoomWithNumber(final int roomNumber) {
        final Room room = rooms.get(roomNumber);
        if (room == null) {
            throw new RoomNotFoundException(roomNumber);
        }
        return room;
    }

    protected Map<Integer, Room> getRooms() {
        return rooms;
    }

    public Maze copy() {
        return new Maze(this);
    }
}
