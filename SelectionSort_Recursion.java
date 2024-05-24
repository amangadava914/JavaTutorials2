import java.util.Arrays;

public class SelectionSort_Recursion {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        SelectionSort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void SelectionSort(int[] arr, int row, int col, int max){
        if (row == 0){
            return;
        }
        if (col < row){
            if (arr[col] > arr[max]){
                SelectionSort(arr, row, col + 1, col);
            }
            SelectionSort(arr, row, col + 1, max);
        }
        else {
            int temp = arr[max];
            arr[max] = arr[row - 1];
            arr[row - 1] = temp;
            SelectionSort(arr, row - 1, 0, 0);
        }
    }

}
