import java.util.*;

public class Recursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number that you wanted to some of all the number who is lower then the given numbers : ");
        int res = sum(in.nextInt());
        System.out.println("The Sum of numbers is : " + res);
    }
        public static int sum(int n){
        if(n > 0){
            return n + sum(n-1);
        }
        else{
            return 0;
        }
    }
}
