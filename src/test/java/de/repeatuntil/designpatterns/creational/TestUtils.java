package de.repeatuntil.designpatterns.creational;

import de.repeatuntil.designpatterns.creational.abstractfactory.BombedWall;
import de.repeatuntil.designpatterns.creational.abstractfactory.DoorNeedingSpell;
import de.repeatuntil.designpatterns.creational.abstractfactory.EnchantedRoom;
import de.repeatuntil.designpatterns.creational.abstractfactory.RoomWithABomb;
import de.repeatuntil.designpatterns.maze.*;
import org.jetbrains.annotations.NotNull;

import static org.junit.Assert.assertTrue;

/**
 * Created by Alpar Szotyori on 2/24/17.
 */
public final class TestUtils {

    private TestUtils() {
    }

    @SuppressWarnings("ConstantConditions")
    public static void assertHasDefaultTypes(@NotNull final Maze maze) {
        assertTrue(maze.getRoomWithNumber(1) instanceof Room);
        assertTrue(maze.getRoomWithNumber(2) instanceof Room);
        assertTrue(maze.getRoomWithNumber(1).getSide(Direction.NORTH) instanceof Wall);
        assertTrue(maze.getRoomWithNumber(1).getSide(Direction.EAST) instanceof Door);
        assertTrue(maze.getRoomWithNumber(1).getSide(Direction.SOUTH) instanceof Wall);
        assertTrue(maze.getRoomWithNumber(1).getSide(Direction.WEST) instanceof Wall);
        assertTrue(maze.getRoomWithNumber(2).getSide(Direction.NORTH) instanceof Wall);
        assertTrue(maze.getRoomWithNumber(2).getSide(Direction.EAST) instanceof Wall);
        assertTrue(maze.getRoomWithNumber(2).getSide(Direction.SOUTH) instanceof Wall);
        assertTrue(maze.getRoomWithNumber(2).getSide(Direction.WEST) instanceof Door);
    }

    public static void assertHasEnchantedTypes(@NotNull final Maze maze) {
        assertTrue(maze.getRoomWithNumber(1) instanceof EnchantedRoom);
        assertTrue(maze.getRoomWithNumber(2) instanceof EnchantedRoom);
        assertTrue(maze.getRoomWithNumber(1).getSide(Direction.NORTH) instanceof Wall);
        assertTrue(maze.getRoomWithNumber(1).getSide(Direction.EAST) instanceof DoorNeedingSpell);
        assertTrue(maze.getRoomWithNumber(1).getSide(Direction.SOUTH) instanceof Wall);
        assertTrue(maze.getRoomWithNumber(1).getSide(Direction.WEST) instanceof Wall);
        assertTrue(maze.getRoomWithNumber(2).getSide(Direction.NORTH) instanceof Wall);
        assertTrue(maze.getRoomWithNumber(2).getSide(Direction.EAST) instanceof Wall);
        assertTrue(maze.getRoomWithNumber(2).getSide(Direction.SOUTH) instanceof Wall);
        assertTrue(maze.getRoomWithNumber(2).getSide(Direction.WEST) instanceof DoorNeedingSpell);
    }

    public static void assertHasBombedTypes(@NotNull final Maze maze) {
        assertTrue(maze.getRoomWithNumber(1) instanceof RoomWithABomb);
        assertTrue(maze.getRoomWithNumber(2) instanceof RoomWithABomb);
        assertTrue(maze.getRoomWithNumber(1).getSide(Direction.NORTH) instanceof BombedWall);
        assertTrue(maze.getRoomWithNumber(1).getSide(Direction.EAST) instanceof Door);
        assertTrue(maze.getRoomWithNumber(1).getSide(Direction.SOUTH) instanceof BombedWall);
        assertTrue(maze.getRoomWithNumber(1).getSide(Direction.WEST) instanceof BombedWall);
        assertTrue(maze.getRoomWithNumber(2).getSide(Direction.NORTH) instanceof BombedWall);
        assertTrue(maze.getRoomWithNumber(2).getSide(Direction.EAST) instanceof BombedWall);
        assertTrue(maze.getRoomWithNumber(2).getSide(Direction.SOUTH) instanceof BombedWall);
        assertTrue(maze.getRoomWithNumber(2).getSide(Direction.WEST) instanceof Door);
    }
}
