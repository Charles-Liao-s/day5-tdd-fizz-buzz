package tdd.fizzbuzz;

import java.util.List;

public class MarsRover {

    public static final String East = "E";
    public static final String North = "N";
    public static final String South = "S";
    public static final String W = "W";

    public Direction arc(int x, int y, String direction, String command) {
        Direction latestLocation = new Direction(x, y, direction);
        return judgeCommand(x, y, direction, command, latestLocation);
    }

    private static Direction judgeCommand(int x, int y, String direction, String command, Direction direction1) {
        switch (command) {
            case "M":
                direction1 = commandM(x, y, direction, direction1);
                break;
            case "L":
                direction1 = commandL(x, y, direction, direction1);
                break;
            case "R":
                direction1 = commandR(x, y, direction, direction1);
                break;
        }
        return direction1;
    }

    private static Direction commandR(int x, int y, String direction, Direction direction1) {
        switch (direction) {
            case North:
                direction1 = new Direction(x, y, East);
                break;
            case South:
                direction1 = new Direction(x, y, W);
                break;
            case East:
                direction1 = new Direction(x, y, South);
                break;
            case W:
                direction1 = new Direction(x, y, North);
                break;
        }
        return direction1;
    }

    private static Direction commandL(int x, int y, String direction, Direction direction1) {
        switch (direction) {
            case North:
                direction1 = new Direction(x, y, W);
                break;
            case South:
                direction1 = new Direction(x, y, East);
                break;
            case East:
                direction1 = new Direction(x, y, North);
                break;
            case W:
                direction1 = new Direction(x, y, South);
                break;
        }
        return direction1;
    }

    private static Direction commandM(int x, int y, String direction, Direction direction1) {
        switch (direction) {
            case North:
                direction1 = new Direction(x, y + 1, direction);
                break;
            case South:
                direction1 = new Direction(x, y - 1, direction);
                break;
            case East:
                direction1 = new Direction(x + 1, y, direction);
                break;
            case W:
                direction1 = new Direction(x - 1, y, direction);
                break;
        }
        return direction1;
    }
}
