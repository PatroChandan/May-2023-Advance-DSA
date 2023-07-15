package DynamicProgramming.SubsetTargetSum;

import java.util.Arrays;

public class SubsetTargetSumDP {
    private static int targetSumHelper(int arr[], int sum, int n, int subsetSum[][]) {
        if(sum == 0) {
            return 1;
        }
        if(n == 0) {
            return 0;
        }

        if(subsetSum[sum][n] != -1) {
            return subsetSum[sum][n];
        }

        if(arr[n - 1] > sum) {
            int result = targetSumHelper(arr, sum, n - 1, subsetSum);
            subsetSum[sum][n] = result;

            return result;
        }

        int include = targetSumHelper(arr, sum - arr[n - 1], n - 1, subsetSum);
        int exclude = targetSumHelper(arr, sum, n - 1, subsetSum);

        int result;
        if(include == 1 || exclude == 1) {
            result = 1;
        }
        else {
            result = 0;
        }

        subsetSum[sum][n] = result;

        return result;
    }

    public static boolean targetSum(int[] arr, int sum) {
        int n = arr.length;
        int subsetSum[][] = new int[sum + 1][n + 1];
        for(int i = 0; i <= sum; i++) {
            Arrays.fill(subsetSum[i], -1);
        }

        int result = targetSumHelper(arr, sum, n, subsetSum);

        return ((result == 1) ? true : false);
    }
}
