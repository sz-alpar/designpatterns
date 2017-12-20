package de.repeatuntil.designpatterns.structural.adapter;

import org.jetbrains.annotations.NotNull;

import de.repeatuntil.designpatterns.foundation.BoundingBox;

/**
 * Created by aszotyori on 19/03/2017.
 */
public interface Shape {

    @NotNull
    Manipulator createManipulator();

    @NotNull
    BoundingBox getBoundingBox();

    void setBoundingBox(@NotNull BoundingBox boundingBox);
}
