package de.repeatuntil.designpatterns.creational.singleton;

import org.jetbrains.annotations.NotNull;

import de.repeatuntil.designpatterns.creational.abstractfactory.MazeFactory;

/**
 * Created by Alpar Szotyori on 2/25/17.
 */
final class MazeFactorySingleton extends MazeFactory {

    @SuppressWarnings("StaticNonFinalField")
    private static MazeFactorySingleton INSTANCE;

    private MazeFactorySingleton() {
    }

    @NotNull
    static MazeFactorySingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MazeFactorySingleton();
        }
        return INSTANCE;
    }
}
