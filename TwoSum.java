public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,5,6,8,11};
        sum(arr, 14);
    }

    static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    static int[] sum(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        sort(arr);
        while (left < right){
            int sum = arr[left] + arr[right];
            if (sum == 14){
                return new int[]{left, right};
            } else if (sum < 14) {
                left++;
            }
            else{
                right--;
            }
        }
        return new int[]{-1,-1};
    }

    static void swap(int[] arr, int index1, int index2){
         int temp = arr[index1];
        arr[index1] = arr[index2];
         arr[index2] = temp;
    }
}
