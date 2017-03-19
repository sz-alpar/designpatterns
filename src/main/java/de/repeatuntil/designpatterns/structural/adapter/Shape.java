package de.repeatuntil.designpatterns.structural.adapter;

import de.repeatuntil.designpatterns.foundation.BoundingBox;

/**
 * Created by aszotyori on 19/03/2017.
 */
public interface Shape {

    BoundingBox getBoundingBox();

    void setBoundingBox(BoundingBox boundingBox);

    Manipulator createManipulator();
}
