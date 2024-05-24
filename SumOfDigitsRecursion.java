import java.util.*;

public class SumOfDigitsRecursion {
    public static void main(String[] args) {
        System.out.print("Enter a Digits : ");
        Scanner in = new Scanner(System.in);
        int digits = in.nextInt();
        int res = SumOfDigits(digits);
        System.out.print("The Sum of Digits "+ digits + " is : " + res);
    }

    static int SumOfDigits(int digits){
        if (digits == 0){
            return 0;
        }

        return (digits % 10) + SumOfDigits(digits / 10);
    }
}

