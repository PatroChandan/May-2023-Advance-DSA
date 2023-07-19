package DynamicProgramming.Knapsack.UnboundedKnapsack;

import java.util.Arrays;

public class UnboundedKnapsackDP {
    private static int getMaximumValueHelper(int weights[], int values[], int n, int maxWeight, int knapsack[][]) {
        if(n == 0 || maxWeight == 0) {
            return 0;
        }

        if(knapsack[n][maxWeight] != -1) {
            return knapsack[n][maxWeight];
        }

        if(weights[n - 1] > maxWeight) {
            int exclude = getMaximumValueHelper(weights, values, n - 1, maxWeight, knapsack);
            knapsack[n][maxWeight] = exclude;

            return exclude;
        }

        int include = values[n - 1] + getMaximumValueHelper(weights, values, n, maxWeight - weights[n - 1], knapsack);
        int exclude = getMaximumValueHelper(weights, values, n - 1, maxWeight, knapsack);

        int maxValue = Math.max(include, exclude);

        knapsack[n][maxWeight] = maxValue;

        return maxValue;
    }

    public static int getMaximumValue(int weights[], int values[], int n, int maxWeight){
        int knapsack[][] = new int[n + 1][maxWeight + 1];
        for(int i = 0; i <= n; i++) {
            Arrays.fill(knapsack[i], -1);
        }

        return getMaximumValueHelper(weights, values, n, maxWeight, knapsack);
    }
}
