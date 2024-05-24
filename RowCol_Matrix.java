// Binary Search in 2D arrays.

import java.util.*;
import java.util.Arrays;


public class RowCol_Matrix {
    public static void main(String[] args) {
        int[][] array = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        System.out.print("Enter the target element :");
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        System.out.print(Arrays.toString(search(array, target)));
    }

    static int[] search(int[][] matrix, int target){
        int row = 0;
        int col = matrix.length - 1;

        while (row < matrix.length && col >= 0){

            if(matrix[row][col] == target){
                return new int[]{row, col};
            }

            if (matrix[row][col] > target){
                col--;
            }

            else{
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}
