package DynamicProgramming.Knapsack.ZeroOneKnapsack.PostClass;

import java.util.Arrays;

public class CountSubsetWithGivenDifferenceDP {
    static int countSubHelper(int[] arr, int i, int currentSum, int requiredSum, int subsetCount[][]) {
        if(currentSum == requiredSum) {
            return 1;
        }

        if(i == arr.length) {
            return 0;
        }

        if(subsetCount[i][currentSum] != -1) {
            return subsetCount[i][currentSum];
        }

        int sum = currentSum + arr[i];

        if(sum > requiredSum) {
            int count = countSubHelper(arr, i + 1, currentSum, requiredSum, subsetCount);
            subsetCount[i][currentSum] = count;

            return count;
        }

        int include = countSubHelper(arr, i + 1, sum, requiredSum, subsetCount);
        int exclude = countSubHelper(arr, i + 1, currentSum, requiredSum, subsetCount);

        int count = include + exclude;
        subsetCount[i][currentSum] = count;

        return count;
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

        int subsetCount[][] = new int[N + 1][requiredSum + 1];
        for(int i = 0; i <= N; i++) {
            Arrays.fill(subsetCount[i], -1);
        }

        return countSubHelper(arr, 0, 0, requiredSum, subsetCount);
    }
}
