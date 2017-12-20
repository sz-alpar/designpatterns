package de.repeatuntil.designpatterns.foundation;

/**
 * Created by aszotyori on 19/03/2017.
 */
public final class Size {

    public static final Size ZERO = new Size(0, 0);
    private final float height;
    private final float width;

    public Size(final float width, final float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int hashCode() {
        int result = (width != +0.0f ? Float.floatToIntBits(width) : 0);
        result = 31 * result + (height != +0.0f ? Float.floatToIntBits(height) : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        final Size size = (Size) obj;

        if (Float.compare(size.width, width) != 0) {
            return false;
        }
        return Float.compare(size.height, height) == 0;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }
}
