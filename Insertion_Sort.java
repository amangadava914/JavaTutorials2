import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = {16,864,71,40,-6465,-80,94,30,51,351,958,-322};
        insertion(arr);
        System.out.print(Arrays.toString(arr));
    }

    static void insertion(int[] arr) {
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

    static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;
    }
}
