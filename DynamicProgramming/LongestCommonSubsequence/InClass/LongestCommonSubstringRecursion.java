package DynamicProgramming.LongestCommonSubsequence.InClass;

public class LongestCommonSubstringRecursion {
    private static int longestCommonSubsequenceHelper(char s1Arr[], char s2Arr[], int i, int j) {
        if(i == 0 || j == 0) {
            return 0;
        }

        if(s1Arr[i - 1] == s2Arr[j - 1]) {
            return (1 + longestCommonSubsequenceHelper(s1Arr, s2Arr, i - 1, j - 1));
        }

        return Math.max (longestCommonSubsequenceHelper(s1Arr, s2Arr, i, j - 1),
                longestCommonSubsequenceHelper(s1Arr, s2Arr, i - 1, j));
    }

    public static int longestCommonSubsequence(String s1, String s2) {
        char s1Arr[] = s1.toCharArray();
        char s2Arr[] = s2.toCharArray();

        int s1Length = s1Arr.length;
        int s2Length = s2Arr.length;

        return longestCommonSubsequenceHelper(s1Arr, s2Arr, s1Length, s2Length);
    }
}
