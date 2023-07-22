package DynamicProgramming.Knapsack.ZeroOneKnapsack.InClass;

public class ZeroOneKnapsackDP {
    static int maxWeightHelper(int w[], int v[], int W, int n, int knapsack[][]) {
        if(n == 0 || W == 0) {
            return 0;
        }

        if(knapsack[n][W] != -1) {
            return knapsack[n][W];
        }

        if(w[n - 1] <= W) {
            int include = maxWeightHelper(w, v, W - w[n - 1], n - 1, knapsack) + v[n - 1];
            int exclude = maxWeightHelper(w, v, W, n - 1, knapsack);

            int maxValue = Math.max(include, exclude);

            knapsack[n][W] = maxValue;

            return maxValue;
        }
        else {
            int exclude = maxWeightHelper(w, v, W, n - 1, knapsack);

            knapsack[n][W] = exclude;

            return exclude;
        }
    }

    static int maxWeight(int w[], int v[], int W) {
        int n = w.length;

        int knapsack[][] = new int[n + 1][W + 1];
        for(int i = 0; i <= n; i++) {
            for(int j = 0; j <= W; j++) {
                knapsack[i][j] = -1;
            }
        }

        return maxWeightHelper(w, v, W, n, knapsack);
    }
}
