import java.util.Scanner;

public class Arrays {
    public static void main (String[] args){

        //In Java Primitives are stored in Stack memory
        //and all the other objects are stored in the heap memory

        // int[] ros; // Declaration of Array, ros[] is getting defined in the stack memory.
        //ros = new int[5]; // Initialization : actually here is an object created in the Heap memory.

       // int[] arr = {1, 2, 3, 4,5};
       // System.out.print("The Array is :"+(arr.toString()));

        // int[] res = new int[5]; // by default value : [0,0,0,0,0]
        // System.out.println(res[0]);

       // String[] str = new String[5];// By Default Value : [null,null,null,null,null]
        // System.out.println("THE String is :"+str[1]);

       //  boolean[] bool = new boolean[2];
       // System.out.println(bool[0]);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int size = input.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the " + (i+1) + " Element Value :" );
            arr[i] = input.nextInt();
        }
        for (int elements: arr) {
            System.out.print("[" + elements + "] ");
        }
        //System.out.println(arr[1]);
    }
}

