public class WordSearch {

    public static boolean exist(char[][] board, String word) {

        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                if (dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean dfs(
            char[][] board,
            String word,
            int row,
            int col,
            int index) {

        // Entire word found
        if (index == word.length()) {
            return true;
        }

        // Boundary checks
        if (row < 0 ||
            row >= board.length ||
            col < 0 ||
            col >= board[0].length ||
            board[row][col] != word.charAt(index)) {

            return false;
        }

        // Save character
        char temp = board[row][col];

        // Mark visited
        board[row][col] = '#';

        // Explore all directions
        boolean found =
                dfs(board, word, row + 1, col, index + 1) ||
                dfs(board, word, row - 1, col, index + 1) ||
                dfs(board, word, row, col + 1, index + 1) ||
                dfs(board, word, row, col - 1, index + 1);

        // Restore character
        board[row][col] = temp;

        return found;
    }

    public static void main(String[] args) {

        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };

        String word = "ABCCED";

        boolean result = exist(board, word);

        System.out.println("Word Found: " + result);
    }
}