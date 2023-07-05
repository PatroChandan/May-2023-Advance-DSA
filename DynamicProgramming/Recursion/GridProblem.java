package DynamicProgramming.Recursion;

import java.util.Scanner;

public class GridProblem {
    private static int countPaths(int n1, int m1) {
        if(n1 == 0 && m1 == 0) {
            return 1;
        }
        if(n1 < 0 || m1 < 0) {
            return 0;
        }

        return countPaths(n1 - 1, m1) + countPaths(n1, m1 - 1);
    }

    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int count = countPaths(n - 1, m - 1);

        System.out.println(count);
    }
}
