package DynamicProgramming.Grids;

public class UniquePathsDP {
    private static long uniquePathsHelper(int m, int n, long pathCount[][]) {
        if(m == 0 || n == 0) {
            pathCount[m][n] = 1;
            return 1;
        }

        if(pathCount[m][n] != 0) {
            return pathCount[m][n];
        }

        long totalCount = uniquePathsHelper(m, n - 1, pathCount) + uniquePathsHelper(m - 1, n, pathCount);
        pathCount[m][n] = totalCount;

        return totalCount;
    }

    public static long uniquePaths(int m, int n) {
        long pathCount[][] = new long[m][n];

        return uniquePathsHelper(m - 1, n - 1, pathCount);
    }
}
