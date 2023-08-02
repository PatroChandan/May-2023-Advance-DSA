package DynamicProgramming.Grids;

import java.util.Arrays;

public class MinimumPathSumRecursionDP {
    private int minPathSumHelper(int grid[][], int row, int column, int pathSum[][]) {
        if(row == 0 && column == 0) {
            return grid[row][column];
        }

        if(row == 0) {
            return (grid[row][column] + minPathSumHelper(grid, row, column - 1, pathSum));
        }

        if(column == 0) {
            return (grid[row][column] + minPathSumHelper(grid, row - 1, column, pathSum));
        }

        if(pathSum[row][column] != -1) {
            return pathSum[row][column];
        }

        pathSum[row][column] = (grid[row][column] + Math.min(minPathSumHelper(grid, row, column - 1, pathSum), minPathSumHelper(grid, row - 1, column, pathSum)));

        return pathSum[row][column];
    }

    public int minPathSum(int n, int m, int[][] grid) {
        // code here :))
        int pathSum[][] = new int[n][m];
        for(int i = 0; i < n; i++) {
            Arrays.fill(pathSum[i], -1);
        }

        return minPathSumHelper(grid, n - 1, m - 1, pathSum);
    }
}
