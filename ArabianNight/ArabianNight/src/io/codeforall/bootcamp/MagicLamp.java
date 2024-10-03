package io.codeforall.bootcamp;

public class MagicLamp {
    private int maxGenie;
    private int numberRub;
    private int numberRecycles;

    public MagicLamp(int maxGenie){
        this.maxGenie = maxGenie;
        this.numberRub= numberRub;
    }
    public Genie rubLamp() {
        numberRub ++;
        if (numberRub > maxGenie){
            System.out.println("Got a demon");
            return new Demon();
        }
        if (numberRub % 2 == 1) {
            System.out.println("You got a Grumpy");
            return new Grumpy();
        } else{
            System.out.println("You got a Friendly");
            return new Friendly();
        }
    }
    public void recycle(){
        numberRub = 0;
        numberRecycles ++;
        System.out.println("You have magicLamp reseted");
    }
}

// COMPARATION







