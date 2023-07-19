package DynamicProgramming.Knapsack.UnboundedKnapsack;

public class IntegerPartitionDP {
    private static long partitionIntegerHelper(int n, long partitionProduct[]) {
        if(n == 1) {
            return 1;
        }

        if(partitionProduct[n] != 0) {
            return partitionProduct[n];
        }

        long maxProduct = 0;
        for(int i = 1; i < n; i++) {
            int firstPart = i;
            int secondPart = n - firstPart;
            long secondPartMaxProduct = Math.max(secondPart, partitionIntegerHelper(secondPart, partitionProduct));

            long currentMaxProduct = firstPart * secondPartMaxProduct;
            maxProduct = Math.max(maxProduct, currentMaxProduct);
        }

        partitionProduct[n] = maxProduct;

        return maxProduct;
    }

    public static long partitionInteger(int n) {
        long partitionProduct[] = new long[n + 1];
        return partitionIntegerHelper(n, partitionProduct);
    }
}
