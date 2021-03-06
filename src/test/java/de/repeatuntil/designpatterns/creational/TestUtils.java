package de.repeatuntil.designpatterns.creational;

import static org.junit.Assert.assertTrue;

import org.jetbrains.annotations.NotNull;

import de.repeatuntil.designpatterns.creational.abstractfactory.BombedWall;
import de.repeatuntil.designpatterns.creational.abstractfactory.DoorNeedingSpell;
import de.repeatuntil.designpatterns.creational.abstractfactory.EnchantedRoom;
import de.repeatuntil.designpatterns.creational.abstractfactory.RoomWithABomb;
import de.repeatuntil.designpatterns.maze.Direction;
import de.repeatuntil.designpatterns.maze.Door;
import de.repeatuntil.designpatterns.maze.Maze;
import de.repeatuntil.designpatterns.maze.Room;
import de.repeatuntil.designpatterns.maze.Wall;

/**
 * Created by Alpar Szotyori on 2/24/17.
 */
public final class TestUtils {

    private TestUtils() {
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
}
