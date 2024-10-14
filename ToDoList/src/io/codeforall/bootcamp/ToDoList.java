package io.codeforall.bootcamp;

import java.util.PriorityQueue;

public class ToDoList {

    PriorityQueue priorityQueue = new PriorityQueue();

  public void add(Importance importance, int priority, String item) {
      Task task = new Task(importance, priority, item);
      priorityQueue.add(task);
  }

    public Task remove() {
        return priorityQueue.remove();
    }

    public boolean isEmpty() {
        return false;
    }

  /*public boolean remove(Importance importance, int priority, String item) {
      Task task = new Task(importance, priority, item);
      return priorityQueue.remove(task);
  }*/

  /*public void isEmpty(Importance importance, int priority, String item) {
      Task task = new Task(importance, priority, item);
      priorityQueue.isEmpty();
  }*/

}
