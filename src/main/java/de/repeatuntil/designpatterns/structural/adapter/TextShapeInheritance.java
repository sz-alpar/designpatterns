package de.repeatuntil.designpatterns.structural.adapter;

import org.jetbrains.annotations.NotNull;

import de.repeatuntil.designpatterns.foundation.BoundingBox;
import de.repeatuntil.designpatterns.foundation.Point;
import de.repeatuntil.designpatterns.foundation.Size;

/**
 * Created by aszotyori on 19/03/2017.
 */
public final class TextShapeInheritance extends TextView implements TextShape {

    @NotNull
    @Override
    public Manipulator createManipulator() {
        return new TextManipulator(this);
    }

    @NotNull
    @Override
    public BoundingBox getBoundingBox() {
        final Point bottomLeft = getOrigin();
        final Size extent = getExtent();
        final Point topRight = new Point(bottomLeft.getX() + extent.getWidth(),
                bottomLeft.getY() + extent.getHeight());
        return new BoundingBox(bottomLeft, topRight);
    }

    @Override
    public void setBoundingBox(@NotNull final BoundingBox boundingBox) {
        setOrigin(boundingBox.getBottomLeft());
        final Size extent =
                new Size(boundingBox.getTopRight().getX() - boundingBox.getBottomLeft().getX(),
                        boundingBox.getTopRight().getY() - boundingBox.getBottomLeft().getY());
        setExtent(extent);
    }
}
