package de.repeatuntil.designpatterns.structural.adapter;

import de.repeatuntil.designpatterns.foundation.Point;
import de.repeatuntil.designpatterns.foundation.Size;
import org.jetbrains.annotations.NotNull;

/**
 * Created by aszotyori on 19/03/2017.
 */
public class TextView {

    private Point origin = Point.ZERO;
    private Size extent = Size.ZERO;

    @NotNull
    public Point getOrigin() {
        return origin;
    }

    public void setOrigin(final Point origin) {
        this.origin = origin;
    }

    @NotNull
    public Size getExtent() {
        return extent;
    }

    public void setExtent(final Size extent) {
        this.extent = extent;
    }

    public boolean isEmpty() {
        return extent.equals(Size.ZERO);
    }
}
