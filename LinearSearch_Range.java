import java.util.*;

public class LinearSearch_Range {
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the target element : ");
        int target = in.nextInt();
        int ans = Linear_inRange(arr, target, 1, 5);
        System.out.print("The target Element present at index :" + ans);
    }

    static int Linear_inRange(int[] arr, int target, int start, int end){
        if (arr.length == 0){
            return -1;
        }

        for (int index = start; index <= end; index++) {
            if (target == arr[index]){
                return index;
            }
        }

        return -1;
    }
}
