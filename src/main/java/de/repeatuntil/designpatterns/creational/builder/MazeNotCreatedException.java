package de.repeatuntil.designpatterns.creational.builder;

/**
 * Created by Alpar Szotyori on 2/24/17.
 */
public class MazeNotCreatedException extends IllegalStateException {

    public MazeNotCreatedException() {
        super("Maze was not created. Did you forget to call MazeBuilder#buildMaze()?");
    }
}
