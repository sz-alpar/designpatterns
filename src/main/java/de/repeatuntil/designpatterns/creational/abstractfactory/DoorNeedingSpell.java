package de.repeatuntil.designpatterns.creational.abstractfactory;

import de.repeatuntil.designpatterns.maze.Door;
import de.repeatuntil.designpatterns.maze.MapSite;
import de.repeatuntil.designpatterns.maze.Room;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Alpar Szotyori on 1/5/17.
 */
public class DoorNeedingSpell extends Door {

    public DoorNeedingSpell() {
    }

    public DoorNeedingSpell(@NotNull final Room room1, @NotNull final Room room2) {
        super(room1, room2);
    }

    public DoorNeedingSpell(@NotNull final DoorNeedingSpell other) {
        super(other);
    }

    @NotNull
    @Override
    public MapSite copy() {
        return new DoorNeedingSpell(this);
    }
}
