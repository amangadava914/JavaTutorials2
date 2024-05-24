import java.util.*;

public class ReverseOfNumbers_Recursion {
    public static void main(String[] args) {
        ReverseOfNumbers(10);
    }

    static void ReverseOfNumbers(int number) {
        if (number == 0) {
            return;
        }

        System.out.println(number);
       // ReverseOfNumbers(number--); // it runs infinite  number of times and occur StackOverflow because (number--) returns first number and than subtract.
        ReverseOfNumbers(--number);
    }
}