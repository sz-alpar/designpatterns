package de.repeatuntil.designpatterns.maze;

import org.jetbrains.annotations.NotNull;

/**
 * Created by Alpar Szotyori on 1/5/17.
 */
final class SideNotFoundException extends RuntimeException {

    public SideNotFoundException(@NotNull final Room room, @NotNull final Direction direction) {
        super("Side " + direction + " of room nr " + room.getRoomNumber() + " not found.");
    }
}
