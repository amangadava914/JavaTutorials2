public class RecursionNumberExample {
    public static void main(String[] args) {
        //print1(1);

        //print(1); // another way to print numbers : Recursion
        //Nto1(5);
        printBoth(5);
    }

    /*
    static void print1(int n){
        System.out.println(n);
        print2(2);
    }

    static void print2(int n){
        System.out.println(n);
        print3(3);
    }

    static void print3(int n){
        System.out.println(n);
        print4(4);
    }

    static void print4(int n){
        System.out.println(n);
        print5(5);
    }

    static void print5(int n){
        System.out.println(n);
    }

*/

    static void print(int n){
        // Base Condition
        if (n == 5){
            System.out.println(5);
            return;
        }
        System.out.println(n);

        // Recursive Call
        // if you are calling a function again and again, you can treat it as a separate call in the stack.
        print(n + 1);
    }

    static void Nto1(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        Nto1(n - 1);
    }

    static void printBoth(int n){
        if (n == 0){
            return;
        }

        System.out.println(n);
        printBoth(n - 1);
        System.out.println(n);
    }
}