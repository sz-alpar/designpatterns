package de.repeatuntil.designpatterns.creational.singleton;

import de.repeatuntil.designpatterns.creational.abstractfactory.MazeFactory;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Alpar Szotyori on 2/25/17.
 */
final class MazeFactorySingletonDoubleCheckedLocking extends MazeFactory {

    @SuppressWarnings("StaticNonFinalField")
    private static volatile MazeFactorySingletonDoubleCheckedLocking INSTANCE = null;

    private MazeFactorySingletonDoubleCheckedLocking() {
    }

    @NotNull
    static MazeFactorySingletonDoubleCheckedLocking getInstance() {
        if (INSTANCE == null) {
            synchronized (MazeFactorySingletonDoubleCheckedLocking.class) {
                if (INSTANCE == null) {
                    INSTANCE = new MazeFactorySingletonDoubleCheckedLocking();
                }
            }
        }
        return INSTANCE;
    }

}
