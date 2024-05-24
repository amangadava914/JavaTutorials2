// Find Unique number using XOR operation :- because XOR operator returns 1(in different values) and return 0 (in same values). that's why we're using XOR operation.

public class FindUniqueNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,1,3,6,5,2,3,4,5};
        int N = checkUniqueNo(arr);
        System.out.print("The Unique Number is : " + N);
    }

    private static int checkUniqueNo(int[] arr){
        int unique = 0;
        for (int n : arr) {
            unique ^= n;
        }
        return unique;
    }
}
