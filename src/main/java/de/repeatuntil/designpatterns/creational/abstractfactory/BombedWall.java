package de.repeatuntil.designpatterns.creational.abstractfactory;

import org.jetbrains.annotations.NotNull;

import de.repeatuntil.designpatterns.maze.MapSite;
import de.repeatuntil.designpatterns.maze.Wall;

/**
 * Created by Alpar Szotyori on 1/5/17.
 */
public final class BombedWall extends Wall {

    @NotNull
    @Override
    public MapSite copy() {
        return new BombedWall();
    }
}
