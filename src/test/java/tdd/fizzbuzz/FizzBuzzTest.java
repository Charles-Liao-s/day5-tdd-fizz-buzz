package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    public void should_return_1_when_input_1() {
        int order = 1;

        FizzBuzz fizzBuzz = new FizzBuzz();

        String word = fizzBuzz.countOff(order);

        assert word.equals("1");

    }

    @Test
    public void should_return_2_when_input_2() {
        int order = 2;

        FizzBuzz fizzBuzz = new FizzBuzz();

        String word = fizzBuzz.countOff(order);

        assert word.equals("2");

    }

    @Test
    public void should_return_Fizz_when_input_3() {
        int order = 3;

        FizzBuzz fizzBuzz = new FizzBuzz();

        String word = fizzBuzz.countOff(order);

        assert word.equals("Fizz");

    }
    @Test
    public void should_return_Buzz_when_input_5(){
        int order =5;

        FizzBuzz fizzBuzz = new FizzBuzz();

        String word = fizzBuzz.countOff(order);

        assert word.equals("Buzz");

    }
}
