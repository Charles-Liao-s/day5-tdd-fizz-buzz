package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(int order) {
        if (IsMultipleThreeAndFive(order)) {
            return "FizzBuzz";
        }
        if (IsMultipleThree(order)) {
            return "Fizz";
        }
        if (IsMultipleFive(order)) {
            return "Buzz";
        }
        return "" + order;
    }

    private static boolean IsMultipleThreeAndFive(int order) {
        return order %  3== 0 && order % 5 == 0;
    }

    private static boolean IsMultipleThree(int order) {
        return order % 3 == 0;
    }

    private static boolean IsMultipleFive(int order) {
        return order % 5 == 0;
    }
}
