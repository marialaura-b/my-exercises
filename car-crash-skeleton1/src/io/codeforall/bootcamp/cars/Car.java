package io.codeforall.bootcamp.cars;

import io.codeforall.bootcamp.field.Field;
import io.codeforall.bootcamp.field.Position;

abstract  public class Car {

    /** The position of the car on the grid */
    private Position pos;

    public Car(Position pos){
        this.pos = pos;//o que significa isso??? 10, 20 30????

    }
    public void setPos(Position pos){
        this.pos = pos;
    }
    public Position getPos() {
        return pos;
    }

    public boolean isCrashed() {
        return false;
    }
}
