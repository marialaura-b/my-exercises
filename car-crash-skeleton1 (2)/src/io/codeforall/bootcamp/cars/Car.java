package io.codeforall.bootcamp.cars;

import io.codeforall.bootcamp.field.Position;

abstract  public class Car {

    /** The position of the car on the grid */
    private Position pos;

    private int speed;

    private boolean isCrashed;

    public Car(Position position){
        pos = position;
        this.isCrashed = false;

    }
    /*public void setPos(Position pos){
        this.pos = pos;
    }*/
    public Position getPos() {
        return pos;
    }

    public boolean isCrashed() {
        return false;
    }

    public void setIsCrashed(boolean isCrashed) {
        this.isCrashed = isCrashed;
    }

    public int getSpeed(){
        return speed;
    }

    public void moveRandom() {
        int index = (int) (Math.random() * 4);

        if(index == 0) {
            pos.turnRight(getSpeed());
        } else if (index == 1) {
            pos.turnLeft(getSpeed());
        } else if (index == 2) {
            pos.moveFront(getSpeed());
        } else if (index == 3) {
            pos.moveBack(getSpeed());
        }

    }
}
