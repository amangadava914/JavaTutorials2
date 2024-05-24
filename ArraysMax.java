import java.util.Arrays;
import java.util.Scanner;

public class ArraysMax {
    public static void main(String[] args){
        int[] arr = new int[5];
        System.out.println("Enter the Arrays Elements :");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //System.out.println("The Maximum Array Element Is : " + max(arr));

        System.out.println(maxRange(arr, 1, 5)); //find the max value within the range
    }

    static int max(int[] arr){
        int maxval = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxval) {
                maxval = arr[i];
            }
        }
        return maxval;
    }

    // Find the maximum value within the range.
    static int maxRange(int[] arr, int start, int end){
        int maxValue = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
