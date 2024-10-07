package io.codeforall.bootcamp.cars;

import io.codeforall.bootcamp.field.Position;

public class Tesla extends Car {

    public Tesla() {
        super(new Position());
    }
    @Override
    public int getSpeed() {
        return 2;
    }

    @Override
    public String toString() {
        return "T";
    }
}
