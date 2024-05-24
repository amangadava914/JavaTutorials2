import java.util.Arrays;

public class BubbleSort_Recursion {
    public static void main(String[] args) {
        int[] arr = {13,51,32,1,546,451,156,66,-432,135,0,464,-125,16,6,2,73,45,43,10};
        BubbleSort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void BubbleSort(int[] arr, int row, int col){
        if(row == 0){
            return;
        }
        if (row > col){
            if (arr[col] > arr[col + 1]){
                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;
            }
            BubbleSort(arr, row, col+1);
        }
        else{
            BubbleSort(arr, row - 1, 0);
        }
    }
}
