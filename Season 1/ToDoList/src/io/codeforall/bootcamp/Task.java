package io.codeforall.bootcamp;

public class Task implements Comparable{

    private int priority;
    private String item;

    private Importance importance;

    public Task(Importance importance, int priority, String item) {
        this.priority = priority;
        this.item = item;
        this.importance = importance;
    }

    public int getPriority() {
        return priority;
    }

    public String getItem() {
        return item;
    }

    public Importance getImportance() {
        return importance;
    }

    @Override
    public int compareTo(Task task) {

        if (importance.compareTo(task.importance) == 0) {
            return priority - task.priority;
        }
        return importance.compareTo(task.importance);
    }

    @Override
    public String toString() {
        return
    }
}



