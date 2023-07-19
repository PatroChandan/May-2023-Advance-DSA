package DynamicProgramming.Knapsack.UnboundedKnapsack;

import java.util.Arrays;

public class CutTheRodDP {
    private static int getMaxProfitHelper(int prices[], int n, int profit[]) {
        if(n == 0) {
            return 0;
        }

        if(profit[n] != -1) {
            return profit[n];
        }

        int maxValue = -1;
        for(int i = 1; i <= n; i++) {
            int firstPartLength = i;
            int firstPartPrice = prices[i - 1];
            int secondPartLength = n - i;
            int secondPartPrice = getMaxProfitHelper(prices, secondPartLength, profit);

            int currentMax = firstPartPrice + secondPartPrice;
            maxValue = Math.max(maxValue, currentMax);
        }

        profit[n] = maxValue;

        return maxValue;
    }

    public static int getMaxProfit(int[] a, int n) {
        int profit[] = new int[n + 1];
        Arrays.fill(profit, -1);
        return getMaxProfitHelper(a, n, profit);
    }
}
