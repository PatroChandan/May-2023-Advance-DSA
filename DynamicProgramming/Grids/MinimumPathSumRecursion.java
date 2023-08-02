package DynamicProgramming.Grids;

public class MinimumPathSumRecursion {
    private int minPathSumHelper(int grid[][], int row, int column) {
        if(row == 0 && column == 0) {
            return grid[row][column];
        }

        if(row == 0) {
            return (grid[row][column] + minPathSumHelper(grid, row, column - 1));
        }

        if(column == 0) {
            return (grid[row][column] + minPathSumHelper(grid, row - 1, column));
        }

        return (grid[row][column] + Math.min(minPathSumHelper(grid, row, column - 1), minPathSumHelper(grid, row - 1, column)));
    }

    public int minPathSum(int n, int m, int[][] grid) {
        // code here :))
        return minPathSumHelper(grid, n - 1, m - 1);
    }
}
