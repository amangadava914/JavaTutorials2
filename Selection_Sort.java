import java.util.*;
import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {-5,70,-56,451,1,546,78,-68,83,165,98,-561,161,211,94,84,-65,-11,3214,6,44,13};
        selection(arr);
        System.out.print(Arrays.toString(arr));
    }

     static void selection(int[] arr) {
         for (int i = 0; i < arr.length; i++) {
             // find the maximum item in the remaining array and swap with correct index.
             int last = arr.length - i - 1;
             int maxIndex = getMaxIndex(arr,0,last);

             swap(arr, maxIndex, last);
         }
    }

    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for (int j = start; j <= end; j++) {
            if (arr[max] < arr[j]){
                max = j;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
