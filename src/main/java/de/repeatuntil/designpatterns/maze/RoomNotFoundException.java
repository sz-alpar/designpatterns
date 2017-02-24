package de.repeatuntil.designpatterns.maze;

/**
 * Created by Alpar Szotyori on 1/5/17.
 */
public class RoomNotFoundException extends RuntimeException {

    public RoomNotFoundException(final int roomNumber) {
        super("Room nr " + roomNumber + " not found.");
    }
}
