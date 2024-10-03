package io.codeforall.bootcamp;

import java.sql.SQLOutput;

public class Friendly extends Genie {
    public Friendly() {

        super(3);
    }

    @Override
    public int getWishes() {
        return super.getWishes();
    }

    @Override
    public void makeAWish() {
        if (getWishes() < 3) {
            super.makeAWish();
        } else {
            System.out.println("Friendly can't give you a wish");
        }
    }
}
