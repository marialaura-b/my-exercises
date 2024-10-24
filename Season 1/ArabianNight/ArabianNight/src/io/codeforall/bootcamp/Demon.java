package io.codeforall.bootcamp;

public class Demon extends Genie{
    public boolean recycle = false;

    public Demon(){
        super(20);
    }

    @Override
    public int getWishes() {
        return super.getWishes();
    }

    @Override
    public void makeAWish() {

        super.makeAWish();
        System.out.println("Demon get you a wish, but you have a consequence");
            }
    }

