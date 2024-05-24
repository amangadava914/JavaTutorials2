import java.util.Arrays;

public class Cycle_Sort {
    public static void main(String[] args) {
        int[] arr = {2,5,4,3,1};
        cyclic_sort(arr);
        System.out.print(Arrays.toString(arr));
    }

    static void cyclic_sort(int[] arr){
        int i = 0;

        while (i < arr.length){
            int checkCorrectIndex = arr[i] - 1; // because in java array indexing start from 0, that's why we take arr[i] - 1;
            if (arr[i] != arr[checkCorrectIndex]){
                swap(arr, i, checkCorrectIndex);
            }
            else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
