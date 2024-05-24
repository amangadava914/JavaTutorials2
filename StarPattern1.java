import java.util.Scanner;
public class StarPattern1 {
    public static void main(String[] args) {
        
//        System.out.print("Enter the number : ");
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int res = pattern1(n);
//        System.out.println(res);

       // pattern1(5);
      //  pattern2(5);
      //  pattern3(6);
        pattern28(5);
    }

    /*
     *
     * *
     * * *
     * * * *
     * * * * *
     */
    static int pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // when one row is printed we need to add a newline
            System.out.println();
        }
        return 0;
    }


    /*
     * * * * *
     * * * *
     * * *
     * *
     *
     */
    static void pattern2 (int m){
        for (int row = 1; row <= m; row++) {
            for (int col = 1; col <= m-row+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    
    /*
     *
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *
     * * * * *
     * * * *
     * * *
     * *
     *
     */
    static void pattern3(int a){
        for (int row = 0; row < 2 * a; row++) {
            int totalColsInRow = row > a ? 2 * a - row : row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*

     *
    * *
   * * *
  * * * *
 * * * * *
  * * * *
   * * *
    * *
     *

     */
    static void pattern28(int n){
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            int noOfSpaces = n - totalColsInRow;
            for (int spaces = 0; spaces < noOfSpaces; spaces++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}