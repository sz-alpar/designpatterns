package de.repeatuntil.designpatterns.creational.abstractfactory;

import de.repeatuntil.designpatterns.maze.Room;

/**
 * Created by Alpar Szotyori on 1/5/17.
 */
public class EnchantedRoom extends Room {

    private final Spell spell;

    public EnchantedRoom(final int roomNumber, final Spell spell) {
        super(roomNumber);
        this.spell = spell;
    }
}
