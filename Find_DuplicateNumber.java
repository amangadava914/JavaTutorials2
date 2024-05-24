// https://leetcode.com/problems/find-the-duplicate-number/description/  // problem no 287
// Asked in Amazon

import java.util.Arrays;
public class Find_DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        findDuplicate(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int findDuplicate(int[] arr){
        int i = 0;

        while(i < arr.length) {

            if (arr[i] != arr[i + 1]) {
                int correctIndex = arr[i] - 1;

                if (arr[i] != arr[correctIndex]) {
                    swap(arr, i, correctIndex);
                } else {
                    return arr[i];
                }
            }
            else {
                return i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
