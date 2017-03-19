package de.repeatuntil.designpatterns.structural.adapter;

import org.jetbrains.annotations.NotNull;

/**
 * Created by aszotyori on 19/03/2017.
 */
final class TextManipulator extends Manipulator {

    public TextManipulator(@NotNull final TextShape textShape) {
        super(textShape);
    }
}
