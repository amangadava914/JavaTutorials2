public class Array_Recursion {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,10,22,33,44,77,88,99};
        System.out.println(sorted(arr,0));
    }

    static boolean sorted(int[] arr, int index){
        // Base Condition
        if(index == arr.length - 1){
            return true;
        }

        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }
}
