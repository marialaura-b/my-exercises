package io.codeforall.bootcamp.Abilities;

import io.codeforall.bootcamp.Ability;

public abstract class AbstractAbility implements Ability {
    private String name;

    public AbstractAbility(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
