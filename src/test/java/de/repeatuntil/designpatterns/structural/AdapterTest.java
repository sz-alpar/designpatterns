package de.repeatuntil.designpatterns.structural;

import de.repeatuntil.designpatterns.foundation.BoundingBox;
import de.repeatuntil.designpatterns.foundation.Point;
import de.repeatuntil.designpatterns.foundation.Size;
import de.repeatuntil.designpatterns.structural.adapter.*;
import org.jetbrains.annotations.NotNull;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Created by aszotyori on 19/03/2017.
 */
public class AdapterTest {

    @Test
    public void classAdapter() throws Exception {
        final TextShapeInheritance adapter = new TextShapeInheritance();
        configureTextView(adapter);
        assertAdapterConformsToShape(adapter, adapter);
    }

    private void configureTextView(@NotNull final TextView textView) {
        textView.setExtent(new Size(200, 50));
        textView.setOrigin(new Point(10, 30));
    }

    private void assertAdapterConformsToShape(@NotNull final TextShape adapter, @NotNull final TextView textView) {
        assertFalse(adapter.isEmpty());

        //noinspection UnnecessaryLocalVariable
        final Shape shape = adapter;
        BoundingBox expectedBoundingBox = createBoundingBox(textView.getOrigin(), textView.getExtent());
        assertEquals(expectedBoundingBox, shape.getBoundingBox());

        final Manipulator manipulator = shape.createManipulator();
        final Size newSize = new Size(100, 25);
        manipulator.resize(newSize);
        expectedBoundingBox = createBoundingBox(textView.getOrigin(), newSize);
        assertEquals(expectedBoundingBox, shape.getBoundingBox());
    }

    @NotNull
    private BoundingBox createBoundingBox(@NotNull final Point bottomLeft, @NotNull final Size size) {
        final Point topRight = new Point(bottomLeft.getX() + size.getWidth(),
                                         bottomLeft.getY() + size.getHeight());
        return new BoundingBox(bottomLeft, topRight);
    }

    @Test
    public void objectAdapter() throws Exception {
        final TextView textView = new TextView();
        configureTextView(textView);
        final TextShapeComposition adapter = new TextShapeComposition(textView);
        assertAdapterConformsToShape(adapter, textView);
    }
}
