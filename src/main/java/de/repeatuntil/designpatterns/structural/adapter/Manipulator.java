package de.repeatuntil.designpatterns.structural.adapter;

import de.repeatuntil.designpatterns.foundation.BoundingBox;
import de.repeatuntil.designpatterns.foundation.Point;
import de.repeatuntil.designpatterns.foundation.Size;
import org.jetbrains.annotations.NotNull;

/**
 * Created by aszotyori on 19/03/2017.
 */
public class Manipulator {

    private final Shape shape;

    public Manipulator(@NotNull final Shape shape) {
        this.shape = shape;
    }

    public void resize(@NotNull final Size size) {
        final BoundingBox oldBoundingBox = shape.getBoundingBox();
        final Point topRight = new Point(oldBoundingBox.getBottomLeft().getX() + size.getWidth(),
                                         oldBoundingBox.getBottomLeft().getY() + size.getHeight());
        final BoundingBox boundingBox = new BoundingBox(oldBoundingBox.getBottomLeft(), topRight);
        shape.setBoundingBox(boundingBox);
    }
}
