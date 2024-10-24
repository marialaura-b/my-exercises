package io.codeforall.bootcamp;

public class Main {
    public static void main(String[] args) {

        MagicLamp magicLamp1 = new MagicLamp(3);
        MagicLamp magicLamp2 = new MagicLamp(5);


       Genie genie = magicLamp1.rubLamp();
       genie.makeAWish();
       genie.makeAWish();

       Genie genie2 = magicLamp1.rubLamp();
        genie2.makeAWish();
        genie2.makeAWish();
        genie2.makeAWish();
        genie2.makeAWish();

       Genie genie3 = magicLamp1.rubLamp();

       Genie genie4 = magicLamp1.rubLamp();
        genie4.makeAWish();
        genie4.makeAWish();

        Genie genie5 = magicLamp1.rubLamp();

        magicLamp1.recycle();

        Genie genie6 = magicLamp1.rubLamp();



    }
}
