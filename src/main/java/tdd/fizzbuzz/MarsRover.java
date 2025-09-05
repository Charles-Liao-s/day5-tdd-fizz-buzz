package tdd.fizzbuzz;

public class MarsRover {

    public static final String East = "E";
    public static final String North = "N";
    public static final String South = "S";
    public static final String W = "W";

    public Location arc(int x, int y, String direction, String command) {
        Location latestLocation = new Location(x, y, direction);
        return judgeCommand(x, y, direction, command, latestLocation);
    }

    private static Location judgeCommand(int x, int y, String direction, String command, Location latestLocation) {
        switch (command) {
            case "M":
                latestLocation = commandM(x, y, direction, latestLocation);
                break;
            case "L":
                latestLocation = commandL(x, y, direction, latestLocation);
                break;
            case "R":
                latestLocation = commandR(x, y, direction, latestLocation);
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
