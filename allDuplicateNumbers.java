
// https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class allDuplicateNumbers {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        // arr = [4,3,2,7,8,2,3,1]
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(7);
        arr.add(8);
        arr.add(2);
        arr.add(3);
        arr.add(1);

    }

    public List<Integer> findDuplicates(int[] arr){
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

        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1){
                ans.add(index + 1);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
