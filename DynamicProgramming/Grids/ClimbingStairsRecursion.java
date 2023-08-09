package DynamicProgramming.Grids;

public class ClimbingStairsRecursion {
    static int climbStairsHelper(int n) {
        if(n == 0 || n == 1 || n == 2) {
            return n;
        }

        int totalWays = climbStairsHelper(n - 1) + climbStairsHelper(n - 2); //n = 2

        return totalWays;
    }

    static int climbStairs(int n){
        return climbStairsHelper(n);
    }
}
