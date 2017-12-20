package de.repeatuntil.designpatterns.creational.singleton;

import org.jetbrains.annotations.NotNull;

import de.repeatuntil.designpatterns.creational.abstractfactory.MazeFactory;

/**
 * Created by Alpar Szotyori on 2/25/17.
 */
final class MazeFactorySingletonStaticInit extends MazeFactory {

    private static final MazeFactorySingletonStaticInit INSTANCE =
            new MazeFactorySingletonStaticInit();

    private MazeFactorySingletonStaticInit() {
    }

    @NotNull
    static MazeFactorySingletonStaticInit getInstance() {
        return INSTANCE;
    }

}
