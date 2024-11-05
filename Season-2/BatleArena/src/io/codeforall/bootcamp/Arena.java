package io.codeforall.bootcamp;

import io.codeforall.bootcamp.Hero.Hero;
import java.util.List;

public class Arena {
    private List<Hero> heroes;
    private TurnManager turnManager;

    public Arena(List<Hero> heroes) {
        this.heroes = heroes;
        this.turnManager = new TurnManager(heroes);

    }

    public void startBattle() {
        while (heroes.stream().filter(Hero::isAlive).count() > 1) {
            Hero currentHero = turnManager.getNextHero();
            Hero target = chooseTarget(currentHero);
            if (target != null) {
                currentHero.useAbility(target);
                if (!target.isAlive()) {
                    System.out.println(target.getName() + " has been defeated!");
                }
            }
        }
        System.out.println(("Battle Over! " + getWinner().getName() + " wins!"));
    }

    private Hero chooseTarget(Hero currentHero) {
        return heroes.stream().filter(hero -> hero != currentHero && currentHero.isAlive()).findFirst().orElse(null);
    }

    private Hero getWinner() {
        return heroes.stream().filter(Hero::isAlive).findFirst().orElse(null);
    }
}