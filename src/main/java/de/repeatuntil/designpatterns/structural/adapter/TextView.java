package de.repeatuntil.designpatterns.structural.adapter;

import org.jetbrains.annotations.NotNull;

import de.repeatuntil.designpatterns.foundation.Point;
import de.repeatuntil.designpatterns.foundation.Size;

/**
 * Created by aszotyori on 19/03/2017.
 */
public class TextView {

    private Size extent = Size.ZERO;
    private Point origin = Point.ZERO;

    @NotNull
    public final Size getExtent() {
        return extent;
    }

    public final void setExtent(final Size extent) {
        this.extent = extent;
    }

    @NotNull
    public final Point getOrigin() {
        return origin;
    }

    public final void setOrigin(final Point origin) {
        this.origin = origin;
    }

    public final boolean isEmpty() {
        return extent.equals(Size.ZERO);
    }
}
