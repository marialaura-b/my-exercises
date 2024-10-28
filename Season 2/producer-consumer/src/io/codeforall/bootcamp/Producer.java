package io.codeforall.bootcamp;

import io.codeforall.bootcamp.bqueue.BQueue;
import io.codeforall.bootcamp.bqueue.Pizza;

/**
 * Produces and stores integers into a blocking queue
 */
public class Producer implements Runnable {

    private final BQueue<Pizza> queue;
    private int pizzasToMake;
    private int pizzasDone;

    /**
     * @param queue the blocking queue to add elements to
     * @param elementNum the number of elements to produce
     */
    public Producer(BQueue queue, int elementNum) {
        this.queue = queue;
        this.pizzasToMake = elementNum;
    }

    @Override
    public void run() {


        while (pizzasDone < pizzasToMake) {
            Pizza pizza = new Pizza();
            pizzasDone++;
            System.out.println(Thread.currentThread().getName() + " made a " + pizza);
            queue.offer(pizza);

        }

        System.out.println(Thread.currentThread().getName() + " says: job done. Time to go home.");




    }


}


