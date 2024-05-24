public class CountZeros_Recursion {
    public static void main(String[] args) {
        System.out.println("The No of Zero's is : " + count(30102004));
    }

    static int count(int n){
        return helper(n, 0);
    }


    // Special Patterns, how to pass a value to above calls.
    private static int helper(int n, int count){
        if (n == 0){
            return count;
        }

        int remainder = n % 10;
        if (remainder == 0){
            return helper(n/10, count + 1);
        }

        return helper(n/10, count);
    }
}
