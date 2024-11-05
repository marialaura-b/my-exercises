package io.codeforall.bootcamp.Abilities;

import io.codeforall.bootcamp.Hero.Hero;

public class Fireball extends AbstractAbility {
    public Fireball() {
        super("Fireball");
    }

    @Override
    public void execute(Hero user, Hero target) {
        int damage = 30;
        target.decreaseHealth(damage);
        System.out.println(user.getName() + " casts Fireball on " + target.getName() + " for " + damage + " damage. ");
    }


}
