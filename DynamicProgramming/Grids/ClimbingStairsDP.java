package DynamicProgramming.Grids;

import java.util.Arrays;

public class ClimbingStairsDP {
    static int climbStairsHelper(int n, int count[]) {
        if(n == 0 || n == 1 || n == 2) {
            count[n] = n;
            return n;
        }

        if(count[n] != -1) {
            return count[n];
        }

        int totalWays = climbStairsHelper(n - 1, count) + climbStairsHelper(n - 2, count);
        count[n] = totalWays;

        return totalWays;
    }

    static int climbStairs(int n) {
        int count[] = new int[n + 1];
        Arrays.fill(count, -1);
        return climbStairsHelper(n, count);
    }
}
