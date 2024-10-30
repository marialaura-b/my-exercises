package io.codeforall.bootcamp;

public class Main {

    public static void main(String[] args) {

        MonoOperation squaredNumber = (number) -> number * number;
        System.out.println("The result of duplication is: " + squaredNumber.execute(4));

        BiOperation multiply = (number1, number2) -> number1 * number2;
        System.out.println("The multiply num is: " + multiply.doIt(5,2));

    }
}