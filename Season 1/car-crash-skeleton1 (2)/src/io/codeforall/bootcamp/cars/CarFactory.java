package io.codeforall.bootcamp.cars;

public class CarFactory {

    public static Car getNewCar(int i) {
        int newCar = (int) (Math.random() * 2);
        //System.out.println("Fiat");
        if (newCar == 0) {
            System.out.println(newCar);
            return new Tesla();
        } else {
            System.out.println(newCar);
            return new Mercedes();
        }
    }

}