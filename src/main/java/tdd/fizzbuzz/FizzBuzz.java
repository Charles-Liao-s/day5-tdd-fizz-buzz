package tdd.fizzbuzz;

import java.util.*;

public class FizzBuzz {
    public String countOff(int order) {
        if(order % 3 == 0) {
            return "Fizz";
        }
        return "" + order;
    }
}
