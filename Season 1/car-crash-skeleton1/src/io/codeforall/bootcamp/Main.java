package io.codeforall.bootcamp;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Game g = new Game(100, 25, 200); // g é uma referência a um obj do tipo Game

        g.init(); // Creates a bunch of cars and randomly puts them in the field
        g.start(); // Starts the car crash animation

    }
}
