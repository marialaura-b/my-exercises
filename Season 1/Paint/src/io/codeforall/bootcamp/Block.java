package io.codeforall.bootcamp;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Block {
    public static final int PADDING = 50;

    private int x;
    private int y;
    private final int BLOCK_SIZE = 50;
    private Rectangle block;

    private Rectangle block1;

    public Block(int x, int y) {
        this.x = x;
        this.y = y;
        block = new Rectangle(x * PADDING, y * PADDING, BLOCK_SIZE, BLOCK_SIZE);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Rectangle getBlock() {
        return block;
    }
}