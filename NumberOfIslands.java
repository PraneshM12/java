public class NumberOfIslands {

    public static int numIslands(char[][] grid) {

        int rows = grid.length;
        int columns = grid[0].length;

        int islands = 0;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                if (grid[i][j] == '1') {

                    islands++;

                    dfs(grid, i, j);
                }
            }
        }

        return islands;
    }

    public static void dfs(
            char[][] grid,
            int row,
            int column) {

        // Check boundaries
        if (row < 0 ||
            row >= grid.length ||
            column < 0 ||
            column >= grid[0].length ||
            grid[row][column] == '0') {

            return;
        }

        // Mark current land as visited
        grid[row][column] = '0';

        // Move up
        dfs(grid, row - 1, column);

        // Move down
        dfs(grid, row + 1, column);

        // Move left
        dfs(grid, row, column - 1);

        // Move right
        dfs(grid, row, column + 1);
    }

    public static void main(String[] args) {

        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };

        int result = numIslands(grid);

        System.out.println("Number of Islands: " + result);
    }
}