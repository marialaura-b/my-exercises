package io.codeforall.bootcamp.field;

public class Position {
    private int col;
    private int row;

    public Position() {
        this.col = (int) (Math.random() * (Field.getWidth()));
        this.row = (int) (Math.random() * (Field.getHeight()));
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }


    public void turnRight(int speed) {
        if (col <= Field.getWidth() - 1 - speed) {
            col = col + speed;
        }
    }

    public void turnLeft(int speed) {
        if (col - speed > 0) {
            col = col - speed;
        }
    }

    public void moveFront(int speed) {
        if (row - speed > 0) {
            row = row - speed;
        }
    }

    public void moveBack(int speed) {
        if (row <= Field.getHeight() - 1 - speed) {
            row = row + speed;
        }
    }
}