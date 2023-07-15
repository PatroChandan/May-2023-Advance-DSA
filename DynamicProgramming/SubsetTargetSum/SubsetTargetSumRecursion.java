package DynamicProgramming.SubsetTargetSum;

public class SubsetTargetSumRecursion {
    private static boolean targetSumHelper(int arr[], int sum, int n) {
        if(sum == 0) {
            return true;
        }
        if(n == 0) {
            return false;
        }

        if(arr[n - 1] > sum) {
            return targetSumHelper(arr, sum, n - 1);
        }

        boolean include = targetSumHelper(arr, sum - arr[n - 1], n - 1);
        boolean exclude = targetSumHelper(arr, sum, n - 1);

        return (include || exclude);
    }

    public static boolean targetSum(int[] arr, int sum) {
        return targetSumHelper(arr, sum, arr.length);
    }
}
