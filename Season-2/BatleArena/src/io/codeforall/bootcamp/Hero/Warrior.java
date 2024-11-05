package io.codeforall.bootcamp.Hero;

import io.codeforall.bootcamp.Abilities.Fireball;
import io.codeforall.bootcamp.Abilities.ShieldBlock;

public class Warrior extends Hero{
    public Warrior (String name) {
        super(100, new ShieldBlock(), name);
    }
}