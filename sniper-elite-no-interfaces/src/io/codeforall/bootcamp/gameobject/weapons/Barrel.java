package io.codeforall.bootcamp.gameobject.weapons;

public class Barrel extends GameObject implements Destroyable{


    public BarrelType barrelType;

    public int currentDamage;

    public boolean destroyed;

    public Barrel(BarrelType barrelType) {
        this.barrelType = barrelType;
        this.currentDamage = 0;
        this.destroyed = false;
    }


    public String getMessage(){

        return null;
    }

    @Override
    public void hit() {

    }

    @Override
    public boolean isDestroyed() {
        return this.destroyed;
    }
}
