package io.codeforall.bootcamp;

// Import statements: These lines import necessary classes from external libraries.
//  - Keyboard: This class is used to interact with user keyboard input.
//  - KeyboardEvent: This class represents a keyboard event (e.g., key press, release).
//  - KeyboardEventType: This enum defines different types of keyboard events.
//  - KeyboardHandler: This interface defines methods for handling keyboard events.
//  - Picture: This class is used to display images.

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Garden implements KeyboardHandler {

    // Declare member variables:
    //  - keyboard: This variable will hold a reference to the Keyboard object.
    //  - picture: This variable will hold a reference to the Picture object.
    private Keyboard keyboard;
    private Picture picture;

    // Constructor: This method is called when a new Garden object is created.
    public Garden(){
        // Create a Picture object: This line creates a picture object with the following properties:
        //  - x-coordinate: 20 pixels
        //  - y-coordinate: 20 pixels
        //  - image path: "rsc/flor.jpg" (assuming the image is located in a folder named "rsc")
        picture = new Picture(5,5,"rsc/flower.jpeg");

        // Draw the picture on screen: This line displays the picture on the screen.
        picture.draw();

        // Initialize the keyboard: This method sets up the keyboard for handling input.
        initKeyboard();
    }

    // Method to initialize the keyboard: This method creates a Keyboard object and configures it
    // to listen for specific key presses.
    private void initKeyboard(){
        // Create a Keyboard object: This line creates a new Keyboard object.
        this.keyboard = new Keyboard(this);

        // Define a KeyboardEvent object for right arrow press: This line creates a KeyboardEvent
        // object to represent a press of the right arrow key.
        KeyboardEvent moveRight = new KeyboardEvent();
        moveRight.setKey(KeyboardEvent.KEY_RIGHT); // Set the key to be listened for (right arrow)
        moveRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED); // Set the event type to key press

        // Add the event listener to the keyboard: This line tells the keyboard to listen for the
        // defined event (right arrow press) and call the `keyPressed` method when it happens.
        keyboard.addEventListener(moveRight);

        KeyboardEvent moveLeft = new KeyboardEvent();
        moveLeft.setKey(KeyboardEvent.KEY_LEFT); // Set the key to be listened for (right arrow)
        moveLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED); // Set the event type to key press

        // Add the event listener to the keyboard: This line tells the keyboard to listen for the
        // defined event (right arrow press) and call the `keyPressed` method when it happens.
        keyboard.addEventListener(moveLeft);
    }

    // Method to handle key press events: This method is called by the SimpleGraphics library
    // whenever a key is pressed and the Garden object is registered as a KeyboardHandler.
    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        // Switch statement to handle different key presses: This section checks which key was pressed
        // based on the `keyboardEvent.getKey()` value.
        switch (keyboardEvent.getKey()){
            // Case for right arrow press: If the right arrow key was pressed, the picture is translated
            // 100 pixels to the right.
            case KeyboardEvent.KEY_RIGHT:
                picture.translate(100, 0); // Translate the picture 100 pixels to the right (horizontal movement)
                break;
        }
    }

    // Method to handle key release events (empty in this example): This method is required by the
    // KeyboardHandler interface, but it's currently empty because we're not handling key releases
    // in this specific example.
    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}