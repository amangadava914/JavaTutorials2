import java.util.*;

public class DigitProduct_Recursion {
    public static void main(String[] args) {
        System.out.print("Enter the Digits : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = multiplicationOfDigits(n);
        System.out.print("The Multiplication of each Digits " + n + " is: " + result);
    }

    static int multiplicationOfDigits(int n){
        if (n%10 == n){
            return n;
        }

        return (n%10) * multiplicationOfDigits(n/10);
    }
}
