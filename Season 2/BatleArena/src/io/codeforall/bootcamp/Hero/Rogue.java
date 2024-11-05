package io.codeforall.bootcamp.Hero;

import io.codeforall.bootcamp.Abilities.Fireball;
import io.codeforall.bootcamp.Abilities.SneakAttack;

public class Rogue extends Hero {
    public Rogue (String name) {
        super(100, new SneakAttack(), name);
    }
}