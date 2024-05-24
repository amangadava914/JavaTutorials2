import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {45, 56, 421, 28, 125, 415, 74, 122, 14, 112, 79, 41, 10, 35};
        System.out.print("Enter the target element :");
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        int ans = linearSearch(arr, target);
        System.out.print("The target element found at index :" + ans);
    }

    // Search in the array : return the index if target found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        // run a for loop to check the target element in the entire array
        for(int index = 0; index < arr.length; index++){
            // check every index if target element is present or not if it is present then (arr[index] == target)
            if(arr[index] == target) {
                return index;
            }
        }

        // this line occur when target is not found
        return -1;
    }
}
