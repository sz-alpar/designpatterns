package de.repeatuntil.designpatterns.maze;

/**
 * Created by Alpar Szotyori on 1/5/17.
 */
public class SideNotFoundException extends RuntimeException {

    public SideNotFoundException(Room room, Direction direction) {
        super("Side " + direction + " of room nr " + room.getRoomNumber() + " not found.");
    }
}
