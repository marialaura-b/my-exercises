public class TicTacToe {

    private static final char PLAYER_X = 'X';
    private static final char PLAYER_O = 'O';
    private static final char EMPTY = ' ';

    // Game board
    private char[][] board = new char[3][3];

    // Current player
    private char currentPlayer;

    // Constructor to initialize the game
    public TicTacToe() {
        initializeBoard();
        currentPlayer = PLAYER_X;  // Player X starts first
    }

    // Initialize the board with empty spaces
    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    // Get the current player
    public char getCurrentPlayer() {
        return currentPlayer;
    }

    // Make a move (called from your GameWindow class)
    public boolean makeMove(int row, int col) {
        if (isValidMove(row, col)) {
            board[row][col] = currentPlayer;
            // Switch to the other player after a valid move
            currentPlayer = (currentPlayer == PLAYER_X) ? PLAYER_O : PLAYER_X;
            return true;
        }
        return false;
    }

    // Check if a move is valid
    private boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == EMPTY;
    }

    // Check if there's a winner
    public boolean isWinner(char player) {
        // Check rows, columns, and diagonals
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) || // Row
                    (board[0][i] == player && board[1][i] == player && board[2][i] == player)) { // Column
                return true;
            }
        }
        // Diagonals
        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) || (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }

    // Check if the board is full (i.e., no empty spaces left)
    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    // Get the board state (to draw it in your library)
    public char[][] getBoard() {
        return board;
    }

    public void reset() {
        // Reset the board to empty state
        board = new char[3][3]; // Clears the board
    }
}
