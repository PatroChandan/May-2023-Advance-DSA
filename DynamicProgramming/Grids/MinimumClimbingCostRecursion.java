package DynamicProgramming.Grids;

public class MinimumClimbingCostRecursion {
    public static int minClimbCostHelper(int[] cost, int n) {
        if(n == 0 || n == 1) {
            return cost[n];
        }

        int nMinus1Cost = minClimbCostHelper(cost, n - 1);
        int nMinus2Cost = minClimbCostHelper(cost, n - 2);

        int finalCost = Math.min(nMinus1Cost, nMinus2Cost) + cost[n];

        return finalCost;
    }

    public static int minClimbCost(int[] cost) {
        int n = cost.length;

        int nMinus1Cost = minClimbCostHelper(cost, n - 1);
        int nMinus2Cost = minClimbCostHelper(cost, n - 2);

        int finalCost = Math.min(nMinus1Cost, nMinus2Cost);

        return finalCost;
    }
}
