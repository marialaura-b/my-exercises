package io.codeforall.bootcamp.Hero;

import io.codeforall.bootcamp.Abilities.Heal;

public class Cleric extends Hero{
    public Cleric(String name) {
        super(100, new Heal(), name);
    }
}