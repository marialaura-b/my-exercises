package io.codeforall.bootcamp;

public class Sandbox {

    public static void main(String[] args) {

        Calculator calculator1 = new Calculator("black", "casio");
        System.out.println(calculator1.tellMeYourBrand());


        System.out.println(calculator1.tellMeYourColour()); //

        calculator1.changeColour("blue");

        System.out.println(calculator1.tellMeYourColour());
       Calculator otherCalculator = new Calculator();












        // calculator1.brand = "texas";
        // calculator1.colour = "blue";


        int result = calculator1.add(10, 20, 30, 50);





        int someResult = calculator1.add(result, 50);

        System.out.println(someResult);







        Calculator calculator2 = new Calculator();
        //calculator2.brand = "casio";
/*

        System.out.println("The calculator1 colour is: " + calculator1.colour);
        System.out.println("The calculator2 colour is: " + calculator2.colour);
*/
    }

}
