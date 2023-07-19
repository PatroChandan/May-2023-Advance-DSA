package DynamicProgramming.Knapsack.ZeroOneKnapsack;

public class ZeroOneKnapsackRecursion {
    static int maxWeightHelper(int w[], int v[], int W, int n) {
        if(n == 0 || W == 0) {
            return 0;
        }

        if(w[n - 1] <= W) {
            int include = maxWeightHelper(w, v, W - w[n - 1], n - 1) + v[n - 1];
            int exclude = maxWeightHelper(w, v, W, n - 1);

            int maxValue = Math.max(include, exclude);

            return maxValue;
        }
        else {
            int exclude = maxWeightHelper(w, v, W, n - 1);

            return exclude;
        }
    }

    static int maxWeight(int w[], int v[], int W) {
        int n = w.length;

        return maxWeightHelper(w, v, W, n);
    }
}
