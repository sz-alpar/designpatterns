package de.repeatuntil.designpatterns.foundation;

/**
 * Created by aszotyori on 19/03/2017.
 */
public final class Point {

    public static final Point ZERO = new Point(0, 0);

    private final float x;
    private final float y;

    public Point(final float x, final float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        final Point point = (Point) obj;

        if (Float.compare(point.x, x) != 0) {
            return false;
        }
        return Float.compare(point.y, y) == 0;
    }

    @Override
    public int hashCode() {
        int result = (x != +0.0f ? Float.floatToIntBits(x) : 0);
        result = 31 * result + (y != +0.0f ? Float.floatToIntBits(y) : 0);
        return result;
    }
}
