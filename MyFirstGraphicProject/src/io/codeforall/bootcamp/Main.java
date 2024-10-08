package io.codeforall.bootcamp;

// Import statements: These lines import necessary classes from external libraries.
//  - Color: This class is used to define and manipulate colors for graphics objects.
//  - Rectangle: This class is used to create and manipulate rectangular shapes.
//  - Picture: This class is used to display images. (Not used in this example)

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Main {

    public static void main(String[] args) {

        // Create a rectangle object: This line creates a new Rectangle object with specific dimensions.
        //  - 10: x-coordinate of the top-left corner.
        //  - 10: y-coordinate of the top-left corner.
        //  - 1000: width of the rectangle.
        //  - 1000: height of the rectangle.
        Rectangle rectangle = new Rectangle(10, 10, 1000, 1000);

        // Set the color of the rectangle: This line sets the color of the rectangle to red.
        rectangle.setColor(Color.YELLOW);

        // Fill the rectangle: This line fills the rectangle with the previously set color (red).
        rectangle.fill();

        // Create a Garden object (commented out): This line creates a new Garden object,
        // but it's currently commented out because it's not used in this specific example.
        Garden garden = new Garden();
    }
}