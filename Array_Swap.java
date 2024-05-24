import java.util.*;
import java.util.Arrays;

public class Array_Swap {
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50, 60};

        System.out.println("Before Swapping of Array : " + Arrays.toString(arr));
        swap(arr,1,2);
      //  System.out.print("After Swapping of Array : " + Arrays.toString(arr));

        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

        static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    //reverse the array
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            //swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
