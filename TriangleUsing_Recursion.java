public class TriangleUsing_Recursion {
    public static void main(String[] args) {
        Triangle(5, 0);
        ReverseTriangle(5, 0);
    }

    static void Triangle (int row, int col){
        if (row == 0){
            return;
        }
        if (col < row){
            System.out.print("*");
            Triangle(row, col + 1);
        }
        else {
            System.out.println();
            Triangle(row - 1, 0);
        }
    }

    static void ReverseTriangle(int row, int col){
        if (row == 0){
            return;
        }
        if (col < row){
            ReverseTriangle(row, col + 1);
            System.out.print("*");
        }
        else {
            ReverseTriangle(row - 1, 0);
            System.out.println();
        }
    }
}
