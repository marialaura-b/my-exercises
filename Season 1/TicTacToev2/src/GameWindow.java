import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Line;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;

public class GameWindow implements MouseHandler {

    private final TicTacToe game;  // Instance of the game logic
    private final int cellSize = 100; // Size of each cell in the grid
    private final int PADDING = 10;
    private Text message; // To display game messages

    public GameWindow() {
        // Initialize the game logic
        game = new TicTacToe();
        drawGrid();

        // Initialize mouse handling
        Mouse mouse = new Mouse(this);
        mouse.addEventListener(MouseEventType.MOUSE_CLICKED);  // Listen for mouse clicks
    }

    // Draw the 3x3 grid using rectangles
    private void drawGrid() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Create a rectangle with better hitbox area
                Rectangle cell = new Rectangle(j * cellSize + PADDING, i * cellSize + PADDING, cellSize, cellSize);
                cell.setColor(Color.BLACK); // Set color for the rectangle
                cell.draw();  // Draw the rectangle border
            }
        }
    }

    // Handle mouse clicks
    @Override
    public void mouseClicked(MouseEvent event) {
        handleMouseClick((int) event.getX(), (int) event.getY());
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        // Not used
    }

    // Handle mouse clicks on the grid
    private void handleMouseClick(int x, int y) {
        int row = (y - PADDING) / cellSize; // Adjust to account for padding
        int col = (x - PADDING) / cellSize; // Adjust to account for padding

        // Check if the move is valid and update the game board
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && game.makeMove(row, col)) {
            drawBoard();

            // Check for a winner or draw
            if (game.isWinner('X')) {
                displayMessage("Player 1 wins!");
            } else if (game.isWinner('O')) {
                displayMessage("Player 2 wins!");
            } else if (game.isBoardFull()) {
                displayMessage("Draw!");
            }
        }
    }

    // Draw the current state of the board
    private void drawBoard() {
        char[][] board = game.getBoard();
        drawGrid();  // Redraw the grid

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == 'X') {
                    drawX(row, col);
                } else if (board[row][col] == 'O') {
                    drawO(row, col);
                }
            }
        }
    }

    // Draw an X in the given cell
    private void drawX(int row, int col) {
        int padding = 20; // Padding for centering
        int x1 = col * cellSize + padding; // Start point for line 1 (top left)
        int y1 = row * cellSize + padding; // Start point for line 1 (top left)
        int x2 = (col + 1) * cellSize - padding; // End point for line 1 (bottom right)
        int y2 = (row + 1) * cellSize - padding; // End point for line 1 (bottom right)

        // Use lines instead of rectangles to form the X
        Line line1 = new Line(x1 + PADDING, y1 + PADDING, x2 + PADDING, y2 + PADDING); // Diagonal line from top-left to bottom-right
        Line line2 = new Line(x2 + PADDING, y1 + PADDING, x1 + PADDING, y2 + PADDING); // Diagonal line from top-right to bottom-left
        line1.setColor(Color.RED);  // Set color for the first line
        line2.setColor(Color.RED);  // Set color for the second line
        line1.draw();  // Draw the first line
        line2.draw();  // Draw the second line
    }

    // Draw an O in the given cell
    private void drawO(int row, int col) {
        int padding = 20; // Padding for centering
        int x = col * cellSize + padding; // X coordinate for the circle's top-left corner
        int y = row * cellSize + padding; // Y coordinate for the circle's top-left corner
        int diameter = cellSize - 2 * padding; // Diameter of the circle

        // Draw a circle to represent O using Ellipse
        Ellipse circle = new Ellipse(x + PADDING, y + PADDING, diameter, diameter);
        circle.setColor(Color.BLUE);  // Set color for O
        circle.draw();  // Draw the circle
    }

    // Display a message on the canvas
    private void displayMessage(String text) {
        if (message != null) {
            message.delete(); // Clear previous message
        }

        message = new Text(0, 0, text); // Initialize at (0, 0)
        message.grow(70, 35);  // Adjust size for visibility
        message.setColor(Color.BLACK); // Set the color for the message text

        // Calculate the center of the grid
        int centerX = (cellSize * 3 + PADDING * 2) / 2; // Total width of the grid divided by 2
        int centerY = (cellSize * 3 + PADDING * 2) / 2; // Total height of the grid divided by 2


        message = new Text(centerX - PADDING, centerY - PADDING, text); // Initialize at (0, 0)
        message.grow(70, 35);  // Adjust size for visibility
        message.setColor(Color.BLACK); // Set the color for the message text

        message.draw(); // Draw the message
    }

}
