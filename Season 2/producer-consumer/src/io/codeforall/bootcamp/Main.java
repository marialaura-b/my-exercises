package io.codeforall.bootcamp;

import io.codeforall.bootcamp.bqueue.BQueue;
import io.codeforall.bootcamp.bqueue.Pizza;

public class Main {

    public static void main(String[] args) {

        BQueue<Pizza> queue= new BQueue<>(5);

        Producer p1 = new Producer(queue,10);
        Thread t1 = new Thread(p1);
        t1.setName("p1");

        Producer p2 = new Producer(queue,10);
        Thread t2 = new Thread(p2);
        t2.setName("p2");

        Consumer c1 = new Consumer(queue, 10);
        Thread t3 = new Thread(c1);
        t3.setName("c1");

        Consumer c2 = new Consumer(queue, 10);
        Thread t4 = new Thread(c2);
        t4.setName("c2");

        // Depois, iniciar os consumidores
        t3.start();
        t4.start();

        // Iniciar os produtores primeiro
        t1.start();
        t2.start();

    }

}

