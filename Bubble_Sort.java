import java.util.*;
import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {13,51,32,1,546,451,156,66,-432,135,0,464,-125,16,6,2,73,45,43,10};
        bubble(arr);
        System.out.print(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at the last index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous one
                if(arr[j] < arr[j-1]){
                   // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }

            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program.
            if (!swapped){ // if(swapped == false)  // !false = true
                break;
            }
        }
    }
}
