package io.codeforall.bootcamp;

import io.codeforall.bootcamp.Hero.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Hero mage = new Mage("Gandalf");
        Hero cleric = new Cleric("Alfred");
        Hero warrior = new Warrior("Thorin");
        Hero rogue = new Rogue("Robin");

        Arena arena = new Arena(Arrays.asList(mage, cleric, warrior, rogue));
        arena.startBattle();
    }
}