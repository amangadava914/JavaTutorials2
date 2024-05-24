import java.util.*;

public class Factorial_Recursion {
    public static void main(String[] args) {
        System.out.print("Enter a Number : ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        long factorial = multiplyNumbers(num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }
    public static long multiplyNumbers(int num)
    {
        if (num >= 1)
            return num * multiplyNumbers(num - 1);
        else
            return 1;
    }
}
