import java.util.Scanner;

public class BS_UsingRecursion {
    public static void main(String[] args) {
        int[] arr = {3,5,9,17,24,33,39,45,50};
        Scanner in = new Scanner(System.in);
        System.out.print("Search the target Number : ");
        int target = in.nextInt();
        System.out.println("Target Index : " + Search(arr,target,0,arr.length - 1));
    }

    static int Search(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }

        int mid = start + (end - start)/2;

        if(arr[mid] == target){
            return mid;
        }

        if(target < arr[mid]){
            return Search(arr, target, start, mid - 1);
        }
        return Search(arr, target, mid + 1, end);
    }
}
