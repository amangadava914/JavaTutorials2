import java.util.*;

/*
public class ReverseNo_Recursion {

    // Sometimes you might need some additional variables in the argument in that case, make another function
    static int sum = 0;
    static void reverse(int n){
        if (n == 0){
            return;
        }
        int remainder = n % 10;
        sum = sum * 10 + remainder;
        reverse(n/10);
    }

    public static void main(String[] args) {
        reverse(12345);
        System.out.println(sum);
    }
}
*/


/* =============================== Another Way ================================== */
public class ReverseNo_Recursion {

    static int reverse(int n){
        // Sometimes you might need some additional variables in the argument in that case, make another function
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n % 10 == 0){
            return n;
        }

        int remainder = n % 10;
        return remainder * (int)(Math.pow(10, digits - 1)) + helper(n/10, digits - 1);
    }

    // Palindrome Number : 121, 1234321
    static boolean palindrome(int n){
        return n == reverse(n);
    }

    public static void main(String[] args) {
        System.out.println("The Reverse of a Number is : " + reverse(12345));
        System.out.println(palindrome(1234321));
    }
}