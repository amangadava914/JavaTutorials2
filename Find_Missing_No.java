// this is a cyclic sort algorithm problem

//https:leetcode.com/problems/missing-number/description/ problem no. 268   // Amazon question

import java.util.Arrays;
public class Find_Missing_No {
    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1};

        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else {
                i++;
            }
            // search for missing number
            for (int index = 0; index < arr.length; index++) {
                if (arr[index] != index){
                    return index;
                }
            }
        }
        // case 2
        return arr.length;
    }

     static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}


/*
class Solution {
    public int missingNumber(int[] nums){
        Arrays.sort(nums);
        int number = nums.length;
        for(int index = 0; index < number; index++){
            if(nums[index] != index){
                return index;
            }
        }
        return number;
    }
}
 */