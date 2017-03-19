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
    public final Point getOrigin() {
        return origin;
    }

    public final void setOrigin(final Point origin) {
        this.origin = origin;
    }

    @NotNull
    public final Size getExtent() {
        return extent;
    }

    public final void setExtent(final Size extent) {
        this.extent = extent;
    }

    public final boolean isEmpty() {
        return extent.equals(Size.ZERO);
    }
}
