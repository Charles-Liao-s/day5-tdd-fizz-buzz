package tdd.fizzbuzz;


public class Location {
    private final int x;
    private final int y;
    private final String direction;

    Location(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getDirection() {
        return direction;
    }
}
