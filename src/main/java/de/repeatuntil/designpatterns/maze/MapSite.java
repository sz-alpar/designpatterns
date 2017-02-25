package de.repeatuntil.designpatterns.maze;

import org.jetbrains.annotations.NotNull;

/**
 * Created by Alpar Szotyori on 1/5/17.
 */
public interface MapSite {

    @SuppressWarnings("EmptyMethod")
    void enter();

    @NotNull
    MapSite copy();
}
