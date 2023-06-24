package DynamicProgramming;

public class FibonacciUsingTabulation {
    static int fib(int n) {
        //Write your code here
        if(n == 0) {
            return 0;
        }
        int fibonacci[] = new int[n + 1];
        fibonacci[1] = 1;

        for(int i = 2; i <= n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        return fibonacci[n];
    }
}
