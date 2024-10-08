package io.codeforall.bootcamp;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 10, 1000, 1000);
        rectangle.setColor(Color.CYAN);
        rectangle.fill();

        Garden garden = new Garden();
    }
}
}
