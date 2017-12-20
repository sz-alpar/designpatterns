package de.repeatuntil.designpatterns.foundation;

import org.jetbrains.annotations.NotNull;

/**
 * Created by aszotyori on 19/03/2017.
 */
public final class BoundingBox {

    private final Point bottomLeft;
    private final Point topRight;

    public BoundingBox(@NotNull final Point bottomLeft, @NotNull final Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    @Override
    public int hashCode() {
        int result = bottomLeft.hashCode();
        result = 31 * result + topRight.hashCode();
        return result;
    }

    @Override
    public boolean equals(@NotNull final Object obj) {
        if (this == obj) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        final BoundingBox boundingBox = (BoundingBox) obj;

        if (!bottomLeft.equals(boundingBox.bottomLeft)) {
            return false;
        }
        return topRight.equals(boundingBox.topRight);
    }

    @NotNull
    public Point getBottomLeft() {
        return bottomLeft;
    }

    @NotNull
    public Point getTopRight() {
        return topRight;
    }
}
