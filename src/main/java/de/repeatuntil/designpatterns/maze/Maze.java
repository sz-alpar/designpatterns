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
}
