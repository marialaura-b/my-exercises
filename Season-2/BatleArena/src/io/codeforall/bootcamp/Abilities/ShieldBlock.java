package io.codeforall.bootcamp.Abilities;

import io.codeforall.bootcamp.Hero.Hero;

public class ShieldBlock extends AbstractAbility {
    public ShieldBlock() {
        super("Shield Block");
    }

    @Override
    public void execute(Hero user, Hero target) {
        System.out.println(user.getName() + " blocks the next attack. ");
    }
}

