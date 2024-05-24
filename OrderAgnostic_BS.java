import java.util.*;

public class OrderAgnostic_BS {
    public static void main(String[] args) {
//        int arr[] = {-18, -12, -4, -1, 0, 2, 5, 15, 19, 23, 45};
        int arr[] = {99, 84, 72, 53, 41, 37, 25, 20, 11, 6, 1};
        System.out.print("Enter the target element : ");
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();

        int index = order_Agnostic_BS(arr, target);
        System.out.print("The target element found at index : " + index);
    }

    static int order_Agnostic_BS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

    /*
    boolean isASC;
    if(arr[start] < arr[end]){
    isASC = true;
    }
    else{
    isASC = false;
    }
*/


        boolean isASC = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (isASC) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}