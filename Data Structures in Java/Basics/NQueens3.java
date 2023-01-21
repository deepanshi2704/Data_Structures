public class NQueens3 { // check if solution exists and print any one solution]
    public static boolean isSafe(char board[][], int row, int col) {
        // vertically up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // left upwards diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // right upwards digoanal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    static int count = 0;

    public static boolean nQueen3(char board[][], int row) {
        // base
        if (row == board.length) {
            count++;
            return true;
        }

        // column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if (nQueen3(board, row + 1)) {
                    return true;
                }
                board[row][j] = 'x';
            }
        }
        return false;
    }

    public static void printBoard(char board[][]) {
        System.out.println("----------CHESS BOARD----------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 5;
        char board[][] = new char[n][n];

        // initialize
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'x';
            }
        }
        if (nQueen3(board, 0)) {
            System.out.println("Solution exists");
            printBoard(board);
        } else {
            System.out.println("Solution does not exists");
        }
    }
}
