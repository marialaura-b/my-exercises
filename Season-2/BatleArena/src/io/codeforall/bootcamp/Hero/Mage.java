package io.codeforall.bootcamp.Hero;

import io.codeforall.bootcamp.Abilities.Fireball;

public class Mage extends Hero {
    public Mage (String name) {
        super(100, new Fireball(), name);
    }
}