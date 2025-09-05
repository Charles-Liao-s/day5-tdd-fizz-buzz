package tdd.fizzbuzz;

import java.util.List;

public class MarsRover {
    public Direction arc(int x, int y, String direction, String command) {
        Direction direction1 = new Direction(x, y, direction);
        if(command.equals("M")){
            switch (direction) {
                case "N":
                    direction1 = new Direction(x, y + 1, direction);
                    break;
                case "S":
                    direction1 = new Direction(x, y - 1, direction);
                    break;
                case "E":
                    direction1 = new Direction(x + 1, y, direction);
                    break;
                case "W":
                    direction1 = new Direction(x - 1, y, direction);
                    break;
            }
        }
//        else if(command.equals("L")){
//            switch (direction) {
//                case "N":
//                    direction1 = new Direction(x, y, "W");
//                    break;
//                case "S":
//                    direction1 = new Direction(x, y, "E");
//                    break;
//                case "E":
//                    direction1 = new Direction(x, y, "N");
//                    break;
//                case "W":
//                    direction1 = new Direction(x, y, "S");
//                    break;
//            }
        return direction1;
    }
}
