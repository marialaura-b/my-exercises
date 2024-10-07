package io.codeforall.bootcamp.gameobject.enemy;

import io.codeforall.bootcamp.gameobject.GameObject;
import io.codeforall.bootcamp.gameobject.weapons.Destroyable;

/**
 * An enemy class containing generic enemy functionality and meant for subclassing
 */
public abstract class Enemy extends GameObject implements Destroyable {

    private int health;

    /**
     * Generic enemy constructor
     * @param health the initial health
     */
    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public boolean isDead() {
        return health <= 0;
    }

    /**
     * Removes health according to the hit damage
     * @param damage the damage impact
     */
    public void hit(int damage) {

        health = health - damage > 0 ? health - damage : 0;
    }

    /**
     * @see GameObject#getMessage()
     */
    @Override
    public String getMessage() {
        return "Tango Acquired. Taking it down!";
    }

    @Override
    public boolean isDestroyed() {
        return false;
    }

}
