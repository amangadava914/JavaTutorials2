import java.util.*;

public class ArrayPractice {
    //Q1:= Write a program to take size of array and take values and print the values of array?
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter the size of Array : ");
       int size = in.nextInt();
       int[] array = new int[size];

       for (int i = 0; i < array.length; i++){
           System.out.print("Enter the "+ (i+1) + " Element Value : ");
           array[i] = in.nextInt();
       }
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
