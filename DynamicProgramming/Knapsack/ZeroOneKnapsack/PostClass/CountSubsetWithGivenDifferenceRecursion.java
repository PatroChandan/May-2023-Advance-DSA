package DynamicProgramming.Knapsack.ZeroOneKnapsack.PostClass;

public class CountSubsetWithGivenDifferenceRecursion {
    static int countSubHelper(int[] arr, int i, int currentSum, int requiredSum) {
        if(currentSum == requiredSum) {
            return 1;
        }

        if(i == arr.length) {
            return 0;
        }

        int sum = currentSum + arr[i];

        if(sum > requiredSum) {
            return countSubHelper(arr, i + 1, currentSum, requiredSum);
        }

        int include = countSubHelper(arr, i + 1, sum, requiredSum);
        int exclude = countSubHelper(arr, i + 1, currentSum, requiredSum);

        return (include + exclude);
    }

    static int countSub(int[] arr, int N, int diff) {
        int sum = 0;
        for(int i = 0; i < N; i++) {
            sum += arr[i];
        }

        if((sum < diff) || (sum + diff) % 2 == 1) {
            return 0;
        }

        int requiredSum = (sum + diff) / 2;
        return countSubHelper(arr, 0, 0, requiredSum);
    }
}
