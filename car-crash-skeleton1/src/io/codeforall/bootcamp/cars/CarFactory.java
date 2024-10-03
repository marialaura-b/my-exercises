package io.codeforall.bootcamp.cars;

import io.codeforall.bootcamp.field.Field;
import io.codeforall.bootcamp.field.Position;

public class CarFactory {



    public static Car getNewCar(int position) {
        int newCar = (int) (Math.random() * 2);
        //System.out.println("Fiat");
        if (newCar == 0) {
            return new Fiat(position,position);
        } else {
            return new Mustang(position,position);
        }
    }

}