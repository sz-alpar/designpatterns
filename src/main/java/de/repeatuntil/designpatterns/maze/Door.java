package de.repeatuntil.designpatterns.maze;

import org.jetbrains.annotations.NotNull;

/**
 * Created by Alpar Szotyori on 1/5/17.
 */
public class Door implements MapSite {

    private final Room room1;
    private final Room room2;
    private boolean isOpen;

    public Door(@NotNull final Room room1, @NotNull final Room room2) {
        this.room1 = room1;
        this.room2 = room2;
    }

    public Room otherSideFrom(@NotNull final Room room) {
        if (room.getRoomNumber() == room1.getRoomNumber()) {
            return room2;
        }
        if (room.getRoomNumber() == room2.getRoomNumber()) {
            return room1;
        }
        throw new RoomNotFoundException(room.getRoomNumber());
    }

    @Override
    public void enter() {

    }
}
