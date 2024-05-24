//https://leetcode.com/problems/richest-customer-wealth/description/

import java.util.*;

public class MaxWealth {

    public static void main(String[] args) {

        int[][] accounts = {
                {2, 8, 7},
                {7, 1, 3},
                {1, 9, 5}
        };

        int maxwealth = MaximumWealth(accounts);
        System.out.println("Maximum wealth: " + maxwealth);
    }

    public static int MaximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE; // Initialize ans as the minimum value

        for (int person = 0; person < accounts.length; person++) {
            // when we start a new col, take a new sum for that row.
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }

            // now we have the sum of account of person
            // check with overall ans
            if (sum > ans) {
                ans = sum; // Update ans if current sum is greater
            }
        }
        return ans;
    }
}
