import java.util.*;

public class MultiDimensional_Array {
    public static void main(String[] args) {
        /*
        1 2 3
        4 5 6
        7 8 9
        */
        int[][] arr = new int[3][3];
        //System.out.println(arr.length); // arr.length method shows no of rows in 2d array.

        int[][] arr2d = {
                {1, 2, 3}, // 0th index
                {4, 5, 6, 7}, // 1 index
                {8, 9, 10}, // 2 index  arr2d[3][2] => 9
        };

       // System.out.print(arr2d[0]);
/*
        int[][] my_numbers = {
                {1,2,3},
                {4,5,6,7},
                {8,9,10},
        };

        for (int i = 0; i < my_numbers.length; i++) {
            for (int j = 0; j < my_numbers[i].length; j++) {
                System.out.println(my_numbers[i][j]);
            }
        }
        */

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the input of 2D Array : ");
        // for loops for input
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }
            // for loops for output
            for(int row = 0; row < arr.length; row++){
                for (int col = 0; col < arr[row].length; col++){
                    System.out.print(arr[row][col] + " ");
                }
                System.out.println();
        }
    }
}
