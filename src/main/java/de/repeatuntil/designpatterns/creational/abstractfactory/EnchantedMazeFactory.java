package de.repeatuntil.designpatterns.creational.abstractfactory;

import de.repeatuntil.designpatterns.maze.Door;
import de.repeatuntil.designpatterns.maze.Room;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Alpar Szotyori on 1/5/17.
 */
public class EnchantedMazeFactory extends MazeFactory {

    @NotNull
    @Override
    public Room makeRoom(final int roomNumber) {
        return new EnchantedRoom(roomNumber, castSpell());
    }

    protected Spell castSpell() {
        return new Spell();
    }

    @NotNull
    @Override
    public Door makeDoor(final Room r1, final Room r2) {
        return new DoorNeedingSpell(r1, r2);
    }
}
