package DynamicProgramming;

public class FibonacciUsingMemoization {
    static int fibHelper(int n, int fibonacci[]) {
        if(n <= 1) {
            return n;
        }

        if(fibonacci[n] != 0) {
            return fibonacci[n];
        }

        fibonacci[n] = fibHelper(n - 1, fibonacci) + fibHelper(n - 2, fibonacci);

        return fibonacci[n];
    }

    static int fib(int n){
        //Write your code here
        int fibonacci[] = new int[n + 1];

        return fibHelper(n, fibonacci);
    }
}
