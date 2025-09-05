package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

public class MarsRoverTest {
    @Test
    public void should_return_0_1_N_when_input_0_0_N_and_command_M() {
        int x = 0;
        int y = 0;
        String direction = "N";
        String command = "M";

        MarsRover marsRover = new MarsRover();

        Direction dir = marsRover.arc(x, y, direction, command);
        assert dir.getX() == 0;
        assert dir.getY() == 1;
        assert dir.getDirection().equals("N");

    }

    @Test
    public void should_return_1_0_E_when_input_0_0_E_and_command_M() {
        int x = 0;
        int y = 0;
        String direction = "E";
        String command = "M";

        MarsRover marsRover = new MarsRover();

        Direction dir = marsRover.arc(x, y, direction, command);
        assert dir.getX() == 1;
        assert dir.getY() == 0;
        assert dir.getDirection().equals("E");

    }

    @Test
    public void should_return_0_NE1_S_when_input_0_0_S_and_command_M() {
        int x = 0;
        int y = 0;
        String direction = "S";
        String command = "M";

        MarsRover marsRover = new MarsRover();

        Direction dir = marsRover.arc(x, y, direction, command);
        assert dir.getX() == 0;
        assert dir.getY() == -1;
        assert dir.getDirection().equals("S");

    }

    @Test
    public void should_return_NE1_0_W_when_input_0_0_W_and_command_M() {
        int x = 0;
        int y = 0;
        String direction = "W";
        String command = "M";

        MarsRover marsRover = new MarsRover();

        Direction dir = marsRover.arc(x, y, direction, command);
        assert dir.getX() == -1;
        assert dir.getY() == 0;
        assert dir.getDirection().equals("W");

    }

    @Test
    public void should_return_0_0_W_when_input_0_0_N_and_command_L() {
        int x = 0;
        int y = 0;
        String direction = "N";
        String command = "L";

        MarsRover marsRover = new MarsRover();

        Direction dir = marsRover.arc(x, y, direction, command);
        assert dir.getX() == 0;
        assert dir.getY() == 0;
        assert dir.getDirection().equals("W");

    }

    @Test
    public void should_return_0_0_N_when_input_0_0_E_and_command_L() {
        int x = 0;
        int y = 0;
        String direction = "E";
        String command = "L";

        MarsRover marsRover = new MarsRover();

        Direction dir = marsRover.arc(x, y, direction, command);
        assert dir.getX() == 0;
        assert dir.getY() == 0;
        assert dir.getDirection().equals("N");

    }

    @Test
    public void should_return_0_0_E_when_input_0_0_S_and_command_L() {
        int x = 0;
        int y = 0;
        String direction = "S";
        String command = "L";

        MarsRover marsRover = new MarsRover();

        Direction dir = marsRover.arc(x, y, direction, command);
        assert dir.getX() == 0;
        assert dir.getY() == 0;
        assert dir.getDirection().equals("E");

    }

    @Test
    public void should_return_0_0_N_when_input_0_0_W_and_command_L() {
        int x = 0;
        int y = 0;
        String direction = "W";
        String command = "L";

        MarsRover marsRover = new MarsRover();

        Direction dir = marsRover.arc(x, y, direction, command);
        assert dir.getX() == 0;
        assert dir.getY() == 0;
        assert dir.getDirection().equals("S");

    }
}
