import java.util.*;
public class Linear_Min_And_Max {
    public static void main(String[] args) {
        int[] arr = {0, 85, 11, -1, 40, 145, 99, 999, -0, 64};
        int minimum = minimum_val(arr);
        System.out.println("The minimum value of the given array is : " + minimum);

        int maximum = maximum_val(arr);
        System.out.println("The maximum value of the given array is : " + maximum);
    }

    // find the minimum value of the given array
    static int minimum_val(int[] arr){
        int min = arr[0];

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] < min){
                min = arr[index];
            }
        }
        return min;
    }

    // find the maximum value of the array
    static int maximum_val(int[] arr){
        int max = arr[0];
        for (int index = 0; index < arr.length; index++){
            if (arr[index] > max){
                max = arr[index];
            }
        }
        return max;
    }
}
