package io.codeforall.bootcamp.gameobject.weapons;

public enum BarrelType {

    METAL(1, "Metal"),
    PLASTIC(2, "Plastic"),
    WOOD(3, "Wood");

    BarrelType(int maxDamage, String type) {
        this.maxDamage = maxDamage;
        this.type = type;
    }

    private String type;
    private int maxDamage;

    public int getMaxDamage() {
        return this.maxDamage;
    }

    public String toString() {
        return this.type;
    }
}