package de.repeatuntil.designpatterns.creational.factorymethod;

import org.jetbrains.annotations.NotNull;

import de.repeatuntil.designpatterns.creational.abstractfactory.DoorNeedingSpell;
import de.repeatuntil.designpatterns.creational.abstractfactory.EnchantedRoom;
import de.repeatuntil.designpatterns.creational.abstractfactory.Spell;
import de.repeatuntil.designpatterns.maze.Door;
import de.repeatuntil.designpatterns.maze.Room;

/**
 * Created by Alpar Szotyori on 2/24/17.
 */
final class EnchantedMazeGame extends MazeGame {

    @NotNull
    @Override
    protected Room makeRoom(final int roomNr) {
        return new EnchantedRoom(roomNr, castSpell());
    }

    private Spell castSpell() {
        return new Spell();
    }

    @NotNull
    @Override
    protected Door makeDoor(@NotNull final Room roomFrom, @NotNull final Room roomTo) {
        return new DoorNeedingSpell(roomFrom, roomTo);
    }
}
