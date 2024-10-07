package io.codeforall.bootcamp;

import io.codeforall.bootcamp.cars.Car;
import io.codeforall.bootcamp.cars.CarFactory;
import io.codeforall.bootcamp.field.Field;

public class Game {

    public static final int MANUFACTURED_CARS = 10;

    /**
     * Container of Cars
     */
    private Car[] cars;

    /**
     * Animation delay
     */
    private int delay;

    public Game(int cols, int rows, int delay) { //Metodo construtor da classe Game

        Field.init(cols, rows);
        this.delay = delay;

    }

    /**
     * Creates a bunch of cars and randomly puts them in the field
     */
    public void init() {

        cars = new Car[MANUFACTURED_CARS];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = CarFactory.getNewCar(i);
            //System.out.println(i);
            //System.out.println(cars[i]);
        }
        Field.draw(cars);

    }

    /**
     * Starts the animation
     *
     * @throws InterruptedException
     */
    public void start() throws InterruptedException {

        while (true) {

            // Pause for a while
            Thread.sleep(delay);

            // Move all cars
            moveAllCars();

            // Update screen
            Field.draw(cars);

        }

    }

    private void moveAllCars() {

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars.length; j++) {
                if (i != j && cars[i].getPos().getRow() == cars[j].getPos().getRow() &&
                        cars[i].getPos().getCol() == cars[j].getPos().getCol()) {
                    cars[i].setIsCrashed(true);
                }
                if (!cars[i].isCrashed()) {
                    cars[i].moveRandom();
                }
            }
        }
    }
}
