package io.codeforall.bootcamp;


import io.codeforall.bootcamp.Hero.Hero;
import java.util.List;

public class TurnManager {
    private List<Hero> heroes;
    private int currentTurnIndex;

    public TurnManager(List<Hero> heroes) {
        this.heroes = heroes;
        this.currentTurnIndex = 0;
    }

    public Hero getNextHero() {
        Hero hero = heroes.get(currentTurnIndex);
        currentTurnIndex = (currentTurnIndex + 1) % heroes.size();
        return hero;
    }
}