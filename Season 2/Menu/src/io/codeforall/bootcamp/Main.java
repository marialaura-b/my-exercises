package io.codeforall.bootcamp;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;

public class Main {
    public static void main(String[] args) {
        Prompt prompt = new Prompt(System.in, System.out);

        // options that you want to be presented are supplied in an array of strings
        String[] options = {"Go", "Stay"};

        // create a menu with those options and set the message
        MenuInputScanner scanner = new MenuInputScanner(options);
        scanner.setMessage("Should I stay or should I go?");

        // show the menu to the user and get the selected answer
        int answerIndex = prompt.getUserInput(scanner);

        System.out.println("User wants to " + options[answerIndex - 1]);
    }
}