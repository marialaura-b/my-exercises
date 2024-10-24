package io.codeforall.bootcamp;

public enum Importance {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    public int importance;

    Importance(int importance){
        this.importance = importance;
    }

    public int getImportance() {
        return this.importance;
    }
}

