package de.repeatuntil.designpatterns.foundation;

/**
 * Created by aszotyori on 19/03/2017.
 */
public class BoundingBox {

    private final Point bottomLeft;
    private final Point topRight;

    public BoundingBox(final Point bottomLeft, final Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public Point getBottomLeft() {
        return bottomLeft;
    }

    public Point getTopRight() {
        return topRight;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        final BoundingBox boundingBox = (BoundingBox) obj;

        if (bottomLeft != null ? !bottomLeft.equals(boundingBox.bottomLeft) : boundingBox.bottomLeft != null) {
            return false;
        }
        return topRight != null ? topRight.equals(boundingBox.topRight) : boundingBox.topRight == null;
    }

    @Override
    public int hashCode() {
        int result = bottomLeft != null ? bottomLeft.hashCode() : 0;
        result = 31 * result + (topRight != null ? topRight.hashCode() : 0);
        return result;
    }
}
