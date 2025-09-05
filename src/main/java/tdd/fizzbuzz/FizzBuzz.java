package tdd.fizzbuzz;

import java.util.*;

public class FizzBuzz {
    public String countOff(int order) {
        if(order % 3 == 0) {
            return "Fizz";
        }
        if(order % 5 == 0) {
            return "Buzz";
        }
        return "" + order;
    }
}
