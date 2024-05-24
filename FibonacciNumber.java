// Fibonacci Number :- 0,1,1,2,3,5,8,13,21,_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _, n
// Using Recursion


public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fibonacci(6));
    }

    static int fibonacci(int n){
        // Base condition
        if(n < 2){
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);  // This is the last function call, or also called tail recursion.
    }
}
