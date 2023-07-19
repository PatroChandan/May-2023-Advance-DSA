package DynamicProgramming.Knapsack.UnboundedKnapsack;

public class UnboundedKnapsackRecursion {
    private static int getMaximumValueHelper(int weights[], int values[], int n, int maxWeight) {
        if(n == 0 || maxWeight == 0) {
            return 0;
        }

        if(weights[n - 1] > maxWeight) {
            return getMaximumValueHelper(weights, values, n - 1, maxWeight);
        }

        int include = values[n - 1] + getMaximumValueHelper(weights, values, n, maxWeight - weights[n - 1]);
        int exclude = getMaximumValueHelper(weights, values, n - 1, maxWeight);

        int maxValue = Math.max(include, exclude);

        return maxValue;
    }

    public static int getMaximumValue(int weights[], int values[], int n, int maxWeight){
        return getMaximumValueHelper(weights, values, n, maxWeight);
    }
}
