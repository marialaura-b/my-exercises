package io.codeforall.bootcamp.Hero;

import io.codeforall.bootcamp.Ability;

//Classe base para os heróis
public class Hero {
    private String name;
    private int health;
    private Ability ability;

    public Hero(int health, Ability ability, String name) {
        this.health = health;
        this.ability = ability;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void decreaseHealth(int amount) {
        this.health -= amount;
    }

    public void increaseHealth(int amount) {
        this.health += amount;
    }

    public void useAbility(Hero target) {
        ability.execute(this, target);
    }

    public boolean isAlive() {
        return health > 0;
    }
}