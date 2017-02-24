package de.repeatuntil.designpatterns.maze;

import org.jetbrains.annotations.NotNull;

/**
 * Created by Alpar Szotyori on 1/5/17.
 */
public class Door implements MapSite {

    private Room room1;
    private Room room2;
    private boolean isOpen;

    public Door() {
    }

    public Door(@NotNull final Room room1, @NotNull final Room room2) {
        this.room1 = room1;
        this.room2 = room2;
    }

    public Door(@NotNull final Door other) {
        this.isOpen = other.isOpen;
        copyRooms(other);
    }

    private void copyRooms(@NotNull final Door other) {
        if (other.room1 != null) {
            this.room1 = (Room) other.room1.copy();
        }
        if (other.room2 != null) {
            this.room2 = (Room) other.room2.copy();
        }
    }

    public void initialize(@NotNull final Room room1, @NotNull final Room room2, final boolean isOpen) {
        this.room1 = room1;
        this.room2 = room2;
        this.isOpen = isOpen;
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

    @NotNull
    @Override
    public MapSite copy() {
        return new Door(this);
    }
}
