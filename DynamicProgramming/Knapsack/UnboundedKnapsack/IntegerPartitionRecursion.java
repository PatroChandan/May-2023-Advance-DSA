package DynamicProgramming.Knapsack.UnboundedKnapsack;

public class IntegerPartitionRecursion {
    private static long partitionIntegerHelper(int n) {
        if(n == 1) {
            return 1;
        }

        long maxProduct = 0;
        for(int i = 1; i < n; i++) {
            int firstPart = i;
            int secondPart = n - firstPart;
            long secondPartMaxProduct = Math.max(secondPart, partitionIntegerHelper(secondPart));

            long currentMaxProduct = firstPart * secondPartMaxProduct;
            maxProduct = Math.max(maxProduct, currentMaxProduct);
        }

        return maxProduct;
    }

    public static long partitionInteger(int n) {
        return partitionIntegerHelper(n);
    }
}
