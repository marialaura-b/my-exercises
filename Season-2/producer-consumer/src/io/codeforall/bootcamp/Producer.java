package io.codeforall.bootcamp;

import io.codeforall.bootcamp.bqueue.BQueue;
import io.codeforall.bootcamp.bqueue.Pizza;

/**
 * Produces and stores integers into a blocking queue
 */
public class Producer implements Runnable {

    private final BQueue<Pizza> queue;
    private int elementNum;
    private int pizzasDone;

    /**
     * @param queue the blocking queue to add elements to
     * @param elementNum the number of elements to produce
     */
    public Producer(BQueue<Pizza> queue, int elementNum) { // Adicionando <Pizza> ao tipo BQueue para evitar warning
        this.queue = queue;
        this.elementNum = elementNum;
        this.pizzasDone = 0;
    }

    @Override
    public void run() {
        // Produzindo pizzas enquanto o número de pizzas feitas é menor que o objetivo
        while (pizzasDone < elementNum) {

            try {
                Thread.sleep((long) (Math.random() * 5000));
            } catch (InterruptedException e) {

            }
            // Tenta adicionar a pizza na fila
            Pizza pizza = new Pizza(); // Criando nova pizza
            queue.offer(pizza);
            pizzasDone++; // Atualiza o contador de pizzas feitas
        }
            // Exibe a mensagem que a pizza foi feita
            System.out.println(Thread.currentThread().getName() + " finished producing.");
        }

        /*public int getElementNum() {
            return this.elementNum;
    }*/
}