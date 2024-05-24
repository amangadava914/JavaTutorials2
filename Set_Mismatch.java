// https://leetcode.com/problems/set-mismatch/description/

import java.util.Arrays;

public class Set_Mismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        duplicate(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] duplicate(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
        // find the missing and duplicate number (duplicate, missing)[index, index+1]
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1){  // if element not present on the correct index arr[1] != 0 + 1 (1 ki index 0 hogi na ki 0 + 1)
                return new int[]{arr[index], index + 1};
            }
        }
        return new int[] {-1, -1};
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
