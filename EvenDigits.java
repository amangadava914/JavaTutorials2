//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
      //  System.out.println(digits(-55547));
        System.out.print(digits2(554654));
    }

    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }


    // check weather a number contains even digits or not.
    static boolean even(int num){
        int number_ofDigits = digits(num);
        /*
        if (number_ofDigits % 2 == 0){
            return true;
        }
        return false;
         */
        return number_ofDigits % 2 == 0;
    }

    // count number of digits in a num
    static int digits(int num){

        if (num < 0){
            num = num * -1;
        }

        if (num == 0){
            return 1;
        }

        int count = 0;
        while (num > 0){
            count++;
            num = num/10;
        }
        return count;
    }

    //another way to find number of digits
    static int digits2(int num){
        if (num < 0){
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }


    /*
    class Solution {
    public int findNumbers(int[] nums) {
        int count =0;
        for (int i = 0; i < nums.length; i++) {
          int  count1=0;
            while (nums[i]>0){
                count1++;
                nums[i]=nums[i]/10;
            }
            if(count1%2==0){
                count++;
            }
        }
        return count;
    }
}
     */
}
