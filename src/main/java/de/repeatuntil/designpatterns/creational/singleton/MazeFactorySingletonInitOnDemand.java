package de.repeatuntil.designpatterns.creational.singleton;

import de.repeatuntil.designpatterns.creational.abstractfactory.MazeFactory;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Alpar Szotyori on 2/25/17.
 */
final class MazeFactorySingletonInitOnDemand extends MazeFactory {

    private MazeFactorySingletonInitOnDemand() {
    }

    @NotNull
    static MazeFactorySingletonInitOnDemand getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static final class LazyHolder {

        private static final MazeFactorySingletonInitOnDemand INSTANCE = new MazeFactorySingletonInitOnDemand();
    }
}
