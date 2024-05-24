// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// asked in Google

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Disappeared_numbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int checkCorrectIndex = nums[i] - 1;
            if (nums[i] != nums[checkCorrectIndex]) {
                swap(nums, i, checkCorrectIndex);
            } else {
                i++;
            }
        }

        // find missing number
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }

    void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
