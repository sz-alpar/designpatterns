package de.repeatuntil.designpatterns.creational.singleton;

import de.repeatuntil.designpatterns.creational.abstractfactory.MazeFactory;
import org.jetbrains.annotations.NotNull;

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
