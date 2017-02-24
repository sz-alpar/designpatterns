package de.repeatuntil.designpatterns.maze;

import org.jetbrains.annotations.NotNull;

/**
 * Created by Alpar Szotyori on 1/5/17.
 */
public class Wall implements MapSite {

    @Override
    public void enter() {

    }

    @NotNull
    @Override
    public MapSite copy() {
        return new Wall();
    }
}
