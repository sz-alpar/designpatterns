package de.repeatuntil.designpatterns.creational.abstractfactory;

import org.jetbrains.annotations.NotNull;

import de.repeatuntil.designpatterns.maze.Door;
import de.repeatuntil.designpatterns.maze.Room;

/**
 * Created by Alpar Szotyori on 1/5/17.
 */
public final class EnchantedMazeFactory extends MazeFactory {

    @NotNull
    @Override
    public Door makeDoor(@NotNull final Room r1, @NotNull final Room r2) {
        return new DoorNeedingSpell(r1, r2);
    }

    @NotNull
    @Override
    public Room makeRoom(final int roomNumber) {
        return new EnchantedRoom(roomNumber, castSpell());
    }

    private Spell castSpell() {
        return new Spell();
    }
}
