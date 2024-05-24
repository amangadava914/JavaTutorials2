import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.print("Enter the target element : ");
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();

        int index = binary_search(arr, target);
        System.out.print("The target element found at index : " + index);
    }

   public static int binary_search(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // int mid = (start+end) + 2; // might be possible that (start+end) exceeds the range of integer in Java.
            int mid = start + (end - start) / 2;
             if (target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
             }
        }
        return -1;
    }
}
