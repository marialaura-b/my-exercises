package io.codeforall.bootcamp;

public class Calculator {

    private String colour;
    private String brand;
    public int numberOfButtons;

    public Calculator(String colour, String someBrand) {
        this.colour = colour;
        this.brand = someBrand;
        this.numberOfButtons = 0;
    }

    public Calculator() {

    }

    public int add(int number1, int number2) {
        return number1 + number2;
    }

    public float add(float number1, float number2) {
        return number1 + number2;
    }

    public int add(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    public int add(int number1, int number2, int number3, int number4) {
        return number1 + number2 + number3 + number4;
    }

    public int subtract(int number1, int number2) {
        return number1 - number2;
    }

    public String tellMeYourBrand() {
        return this.brand;
    }

    public String tellMeYourColour() {
        return this.colour;
    }

    public void changeColour(String newColour) {
        if (newColour.equals("blue") || newColour.equals("green") || newColour.equals("red")) {
            this.colour = newColour;

        }
        System.out.println("That colour is not permitted");
    }

}
