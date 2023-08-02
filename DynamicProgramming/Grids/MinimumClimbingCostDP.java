package DynamicProgramming.Grids;

public class MinimumClimbingCostDP {
    public static int minClimbCostHelper(int[] cost, int n, int totalCost[]) {
        if(n == 0 || n == 1) {
            return cost[n];
        }

        if(totalCost[n] != 0) {
            return totalCost[n];
        }

        int nMinus1Cost = minClimbCostHelper(cost, n - 1, totalCost);
        int nMinus2Cost = minClimbCostHelper(cost, n - 2, totalCost);

        int finalCost = Math.min(nMinus1Cost, nMinus2Cost) + cost[n];

        totalCost[n] = finalCost;

        return finalCost;
    }

    public static int minClimbCost(int[] cost) {
        int n = cost.length;

        int totalCost[] = new int[n];

        int nMinus1Cost = minClimbCostHelper(cost, n - 1, totalCost);
        int nMinus2Cost = minClimbCostHelper(cost, n - 2, totalCost);

        int finalCost = Math.min(nMinus1Cost, nMinus2Cost);

        return finalCost;
    }
}
