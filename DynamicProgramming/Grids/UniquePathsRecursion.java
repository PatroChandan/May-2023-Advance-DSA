package DynamicProgramming.Grids;

public class UniquePathsRecursion {
    private static long uniquePathsHelper(int m, int n) {
        if(m == 0 || n == 0) {
            return 1;
        }

        return uniquePathsHelper(m, n - 1) + uniquePathsHelper(m - 1, n);
    }

    public static long uniquePaths(int m, int n) {
        return uniquePathsHelper(m - 1, n - 1);
    }
}
