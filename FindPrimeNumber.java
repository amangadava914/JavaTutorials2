import java.util.*;

public class FindPrimeNumber {
    public static void main(String[] args) {
        System.out.print("Enter a Number : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " is Prime : " + isPrime(i));
        }
    }

    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }

        int c = 2;
        while (c * c <= n){
            if (n % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
