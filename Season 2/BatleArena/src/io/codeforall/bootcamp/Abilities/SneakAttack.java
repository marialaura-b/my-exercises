package io.codeforall.bootcamp.Abilities;

import io.codeforall.bootcamp.Hero.Hero;

public class SneakAttack extends AbstractAbility {
    public SneakAttack() {
        super("Sneak Attack");
    }

    @Override
    public void execute(Hero user, Hero target) {
        int damage = 25;
        target.decreaseHealth(damage);
        System.out.println(user.getName() + " performs a Sneak Attack on " + target.getName() + " for " + damage + " damage. ");
    }
}
