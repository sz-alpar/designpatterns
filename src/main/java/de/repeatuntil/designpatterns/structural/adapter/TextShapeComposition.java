package de.repeatuntil.designpatterns.structural.adapter;

import org.jetbrains.annotations.NotNull;

import de.repeatuntil.designpatterns.foundation.BoundingBox;
import de.repeatuntil.designpatterns.foundation.Point;
import de.repeatuntil.designpatterns.foundation.Size;

/**
 * Created by aszotyori on 19/03/2017.
 */
public final class TextShapeComposition implements TextShape {

    private final TextView textView;

    public TextShapeComposition(@NotNull final TextView textView) {
        this.textView = textView;
    }

    @NotNull
    @Override
    public Manipulator createManipulator() {
        return new TextManipulator(this);
    }

    @NotNull
    @Override
    public BoundingBox getBoundingBox() {
        final Point bottomLeft = textView.getOrigin();
        final Size extent = textView.getExtent();
        final Point topRight = new Point(bottomLeft.getX() + extent.getWidth(),
                bottomLeft.getY() + extent.getHeight());
        return new BoundingBox(bottomLeft, topRight);
    }

    @Override
    public void setBoundingBox(@NotNull final BoundingBox boundingBox) {
        textView.setOrigin(boundingBox.getBottomLeft());
        final Size extent =
                new Size(boundingBox.getTopRight().getX() - boundingBox.getBottomLeft().getX(),
                        boundingBox.getTopRight().getY() - boundingBox.getBottomLeft().getY());
        textView.setExtent(extent);
    }

    public boolean isEmpty() {
        return textView.isEmpty();
    }
}
