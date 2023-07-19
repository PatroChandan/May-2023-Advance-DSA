package DynamicProgramming.Knapsack.UnboundedKnapsack;

public class CutTheRodRecursion {
    private static int getMaxProfitHelper(int prices[], int n) {
        if(n == 0) {
            return 0;
        }

        int maxValue = -1;
        for(int i = 1; i <= n; i++) {
            int firstPartLength = i;
            int firstPartPrice = prices[i - 1];
            int secondPartLength = n - i;
            int secondPartPrice = getMaxProfitHelper(prices, secondPartLength);

            int currentMax = firstPartPrice + secondPartPrice;
            maxValue = Math.max(maxValue, currentMax);
        }

        return maxValue;
    }

    public static int getMaxProfit(int[] a, int n) {
        return getMaxProfitHelper(a, n);
    }
}
