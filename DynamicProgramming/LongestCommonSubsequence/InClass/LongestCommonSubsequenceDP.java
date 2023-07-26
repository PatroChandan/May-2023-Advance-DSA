package DynamicProgramming.LongestCommonSubsequence.InClass;

import java.util.Arrays;

public class LongestCommonSubsequenceDP {
    private static int longestCommonSubsequenceHelper(char s1Arr[], char s2Arr[], int i, int j, int lcsLength[][]) {
        if(i == 0 || j == 0) {
            return 0;
        }

        if(lcsLength[i][j] != -1) {
            return lcsLength[i][j];
        }

        int length;
        if(s1Arr[i - 1] == s2Arr[j - 1]) {
            length = 1 + longestCommonSubsequenceHelper(s1Arr, s2Arr, i - 1, j - 1, lcsLength);

            lcsLength[i][j] = length;

            return length;
        }

        length =  Math.max(longestCommonSubsequenceHelper(s1Arr, s2Arr, i, j - 1, lcsLength),
                longestCommonSubsequenceHelper(s1Arr, s2Arr, i - 1, j, lcsLength));

        lcsLength[i][j] = length;

        return length;
    }

    public static int longestCommonSubsequence(String s1, String s2) {
        char s1Arr[] = s1.toCharArray();
        char s2Arr[] = s2.toCharArray();

        int s1Length = s1Arr.length;
        int s2Length = s2Arr.length;

        int lcsLength[][] = new int[s1Length + 1][s2Length + 1];
        for(int i = 0; i <= s1Length; i++) {
            Arrays.fill(lcsLength[i], -1);
        }


        return longestCommonSubsequenceHelper(s1Arr, s2Arr, s1Length, s2Length, lcsLength);
    }
}
