package tdd.fizzbuzz;

public class MarsRover {

    public static final String East = "E";
    public static final String North = "N";
    public static final String South = "S";
    public static final String W = "W";
    public static final String MOVE = "M";
    public static final String LEFT = "L";
    public static final String RIGHT = "R";
    public static final String BEHIND = "B";

    public Location arc(int x, int y, String direction, String command) {
        Location latestLocation = new Location(x, y, direction);
        return judgeCommand(x, y, direction, command, latestLocation);
    }

    private static Location judgeCommand(int x, int y, String direction, String command, Location latestLocation) {
        switch (command) {
            case MOVE:
                latestLocation = commandM(x, y, direction, latestLocation);
                break;
            case LEFT:
                latestLocation = commandL(x, y, direction, latestLocation);
                break;
            case RIGHT:
                latestLocation = commandR(x, y, direction, latestLocation);
                break;
            case BEHIND:
                latestLocation = commandB(x, y, direction, latestLocation);
                break;
        }
        return latestLocation;
    }

    private static Location commandB(int x, int y, String direction, Location latestLocation) {
        switch (direction) {
            case North:
                latestLocation = new Location(x, y-1, South);
                break;
            case South:
                latestLocation = new Location(x, y+1, North);
                break;
            case East:
                latestLocation = new Location(x-1, y, W);
                break;
            case W:
                latestLocation = new Location(x+1, y, East);
                break;

        }
        return latestLocation;
    }

    private static Location commandR(int x, int y, String direction, Location latestLocation) {
        switch (direction) {
            case North:
                latestLocation = new Location(x, y, East);
                break;
            case South:
                latestLocation = new Location(x, y, W);
                break;
            case East:
                latestLocation = new Location(x, y, South);
                break;
            case W:
                latestLocation = new Location(x, y, North);
                break;
        }
        return latestLocation;
    }

    private static Location commandL(int x, int y, String direction, Location latestLocation) {
        switch (direction) {
            case North:
                latestLocation = new Location(x, y, W);
                break;
            case South:
                latestLocation = new Location(x, y, East);
                break;
            case East:
                latestLocation = new Location(x, y, North);
                break;
            case W:
                latestLocation = new Location(x, y, South);
                break;
        }
        return latestLocation;
    }

    private static Location commandM(int x, int y, String direction, Location location1) {
        switch (direction) {
            case North:
                location1 = new Location(x, y + 1, direction);
                break;
            case South:
                location1 = new Location(x, y - 1, direction);
                break;
            case East:
                location1 = new Location(x + 1, y, direction);
                break;
            case W:
                location1 = new Location(x - 1, y, direction);
                break;
        }
        return location1;
    }
}
