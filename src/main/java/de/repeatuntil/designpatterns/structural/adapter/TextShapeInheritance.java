package de.repeatuntil.designpatterns.structural.adapter;

import de.repeatuntil.designpatterns.foundation.BoundingBox;
import de.repeatuntil.designpatterns.foundation.Point;
import de.repeatuntil.designpatterns.foundation.Size;
import org.jetbrains.annotations.NotNull;

/**
 * Created by aszotyori on 19/03/2017.
 */
public class TextShapeInheritance extends TextView implements TextShape {

    @NotNull
    @Override
    public BoundingBox getBoundingBox() {
        final Point bottomLeft = getOrigin();
        final Size extent = getExtent();
        final Point topRight = new Point(bottomLeft.getX() + extent.getWidth(), bottomLeft.getY() + extent.getHeight());
        return new BoundingBox(bottomLeft, topRight);
    }

    @Override
    public void setBoundingBox(@NotNull final BoundingBox boundingBox) {
        setOrigin(boundingBox.getBottomLeft());
        final Size extent = new Size(boundingBox.getTopRight().getX() - boundingBox.getBottomLeft().getX(),
                                     boundingBox.getTopRight().getY() - boundingBox.getBottomLeft().getY());
        setExtent(extent);
    }

    @NotNull
    @Override
    public Manipulator createManipulator() {
        return new TextManipulator(this);
    }
}
