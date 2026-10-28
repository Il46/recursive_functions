public class t39 {
    public static void main(String[] args) {
        int n = 4;
        int[] board = new int[n];
        solveNQueens(board, 0, n);
    }
    public static void solveNQueens(int[] board, int row, int n) {
        if (row == n) {
            printBoard(board);
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col)) {
                board[row] = col;
                solveNQueens(board, row + 1, n);
            }
        }
    }
    public static boolean isSafe(int[] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i] == col || Math.abs(board[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }
    public static void printBoard(int[] board) {
        for (int val : board) {
            for (int i = 0; i < board.length; i++) {
                System.out.print(i == val ? "Q " : ". ");
            }
            System.out.println();
        }
        System.out.println("---");
    }
}