import java.util.*;
import java.util.Arrays;

public class LinearSearch_2D {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {50, 60, 70},
                {80, 90, 100, 110}
        };
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the target element : ");
        int target = in.nextInt();

        int[] ans = TwoDimensional_Search(arr, target);
        System.out.println("The target is present in index : " + Arrays.toString(ans));
    }

    static int[] TwoDimensional_Search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (target == arr[row][col]){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

}
