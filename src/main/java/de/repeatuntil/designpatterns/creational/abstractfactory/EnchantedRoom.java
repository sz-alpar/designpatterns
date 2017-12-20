package de.repeatuntil.designpatterns.creational.abstractfactory;

import org.jetbrains.annotations.NotNull;

import de.repeatuntil.designpatterns.maze.MapSite;
import de.repeatuntil.designpatterns.maze.Room;

/**
 * Created by Alpar Szotyori on 1/5/17.
 */
public final class EnchantedRoom extends Room {

    private final Spell spell;

    public EnchantedRoom() {
        this.spell = null;
    }

    public EnchantedRoom(final int roomNumber, final Spell spell) {
        super(roomNumber);
        this.spell = spell;
    }

    private EnchantedRoom(@NotNull final EnchantedRoom other) {
        super(other);
        this.spell = other.spell;
    }

    @NotNull
    @Override
    public MapSite copy() {
        return new EnchantedRoom(this);
    }
}
