package io.codeforall.bootcamp;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class PaintCanvas implements KeyboardHandler {

    private int cols;
    private int rows;
    private Block[][] rectangle;
    private Block cursor;

    public PaintCanvas(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
        drawGrid();
    }

    public void drawGrid() {
        rectangle = new Block[cols][rows];
        for (int coluna = 0; coluna < cols; coluna++) {
            for (int linha = 0; linha < rows; linha++) {
                rectangle[coluna][linha] = new Block(coluna, linha);
                rectangle[coluna][linha].getBlock().draw();
            }
        }
        cursor = new Block(0, 3);
        cursor.getBlock().fill();
        setupKeyboard();
    }

    @Override
    public void keyPressed(KeyboardEvent event) {
        switch (event.getKey()) {
            case KeyboardEvent.KEY_DOWN:
                cursor.getBlock().translate(0, 50);
                break;
            case KeyboardEvent.KEY_RIGHT:
                cursor.getBlock().translate(50, 0);
                break;
            case KeyboardEvent.KEY_LEFT:
                cursor.getBlock().translate(-50, 0);
                break;
            case KeyboardEvent.KEY_UP:
                cursor.getBlock().translate(0, -50);
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

    private void setupKeyboard() {
        Keyboard keyboard = new Keyboard(this);

        KeyboardEvent up = new KeyboardEvent();
        up.setKey(KeyboardEvent.KEY_UP);
        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent down = new KeyboardEvent();
        down.setKey(KeyboardEvent.KEY_DOWN);
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent left = new KeyboardEvent();
        left.setKey(KeyboardEvent.KEY_LEFT);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent right = new KeyboardEvent();
        right.setKey(KeyboardEvent.KEY_RIGHT);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(up);
        keyboard.addEventListener(down);
        keyboard.addEventListener(left);
        keyboard.addEventListener(right);
    }
}