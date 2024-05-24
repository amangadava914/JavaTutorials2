// https://leetcode.com/problems/first-missing-positive/description/
// asked in Amazon

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {};
    }

    static int smallestMissingNumber(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correctPosition = nums[i] - 1;
            if (nums[i] > 0 && nums[i] != nums[correctPosition] && nums[i] <= nums.length){
                swap(nums, i, correctPosition);
            }
            else {
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1){
                return index + 1;
            }
        }
        return nums.length + 1;
    }

    static void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}

/*
class Solution {
    public int firstMissingPositive(int[] nums) {

        //the first two conditions in the if statement take care
        //that negatives and elements greater than the size of
        //the array are ignored, while applying cycle sort, and
        //rest is the similar code of cycle sort

        int i = 0;
        while(i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] <= nums.length && nums[i] > 0 && nums[i] != nums[correct]) {

                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else {
                i++;
            }
        }

        int count = 0;

    //after cycle sort has been applied, we will find the first element
    //which is not at the correct index, and return that index + 1

        for(int j = 0; j < nums.length; j++) {

            if(nums[j] != j + 1) {
                return j + 1;
            }
        }

    //if every element is at its correct index, then obviously the first
    //missing positive integer is nums.length + 1

        return nums.length + 1;
    }
}
 */

/*
public class Solution {
public int firstMissingPositive(int[] nums) {
    int n = nums.length;

    // 1. mark numbers (num < 0) and (num > n) with a special marker number (n+1)
    // (we can ignore those because if all number are > n then we'll simply return 1)
    for (int i = 0; i < n; i++) {
        if (nums[i] <= 0 || nums[i] > n) {
            nums[i] = n + 1;
        }
    }
    // note: all number in the array are now positive, and on the range 1..n+1

    // 2. mark each cell appearing in the array, by converting the index for that number to negative
    for (int i = 0; i < n; i++) {
        int num = Math.abs(nums[i]);
        if (num > n) {
            continue;
        }
        num--; // -1 for zero index based array (so the number 1 will be at pos 0)
        if (nums[num] > 0) { // prevents double negative operations
            nums[num] = -1 * nums[num];
        }
    }

    // 3. find the first cell which isn't negative (doesn't appear in the array)
    for (int i = 0; i < n; i++) {
        if (nums[i] >= 0) {
            return i + 1;
        }
    }

    // 4. no positive numbers were found, which means the array contains all numbers 1..n
    return n + 1;
}
}
 */