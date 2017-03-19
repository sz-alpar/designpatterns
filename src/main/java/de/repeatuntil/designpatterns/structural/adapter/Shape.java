package de.repeatuntil.designpatterns.structural.adapter;

import de.repeatuntil.designpatterns.foundation.BoundingBox;
import org.jetbrains.annotations.NotNull;

/**
 * Created by aszotyori on 19/03/2017.
 */
public interface Shape {

    @NotNull
    BoundingBox getBoundingBox();

    void setBoundingBox(@NotNull BoundingBox boundingBox);

    @NotNull
    Manipulator createManipulator();
}
