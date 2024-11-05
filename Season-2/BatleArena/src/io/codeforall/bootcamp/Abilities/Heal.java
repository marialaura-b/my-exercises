package io.codeforall.bootcamp.Abilities;

import io.codeforall.bootcamp.Hero.Hero;

public class Heal extends AbstractAbility {
    public Heal() {
        super("Heal");
    }

    @Override
    public void execute(Hero user, Hero target) {
        int healAmount = 20;
        target.increaseHealth(healAmount);
        System.out.println(user.getName() + " heals " + target.getName() + " for " + healAmount + " health ");
    }
}
