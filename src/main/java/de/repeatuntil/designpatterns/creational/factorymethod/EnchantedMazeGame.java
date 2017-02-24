package de.repeatuntil.designpatterns.creational.factorymethod;

import de.repeatuntil.designpatterns.creational.abstractfactory.DoorNeedingSpell;
import de.repeatuntil.designpatterns.creational.abstractfactory.EnchantedRoom;
import de.repeatuntil.designpatterns.creational.abstractfactory.Spell;
import de.repeatuntil.designpatterns.maze.Door;
import de.repeatuntil.designpatterns.maze.Room;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Alpar Szotyori on 2/24/17.
 */
public class EnchantedMazeGame extends MazeGame {

    @NotNull
    @Override
    protected Room makeRoom(final int roomNr) {
        return new EnchantedRoom(roomNr, castSpell());
    }

    protected Spell castSpell() {
        return new Spell();
    }

    @NotNull
    @Override
    protected Door makeDoor(@NotNull Room roomFrom, @NotNull Room roomTo) {
        return new DoorNeedingSpell(roomFrom, roomTo);
    }
}
