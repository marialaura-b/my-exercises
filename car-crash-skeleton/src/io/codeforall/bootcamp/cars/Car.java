package io.codeforall.bootcamp.cars;

import io.codeforall.bootcamp.field.Position;

abstract  public class Car {

    /** The position of the car on the grid */
    private Position pos;

    private String typeCar;


    public Position getPos() {
        return pos;
    }

    public boolean isCrashed() {
        return false;
    }
}
