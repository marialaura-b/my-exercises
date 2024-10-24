package io.codeforall.bootcamp;

import java.util.HashMap;
import java.util.Iterator;

public class WordHistogramComp implements Iterable {

    private HashMap<String, Integer> map;

    private String name;

    private String[] string;

    private int count;

    public WordHistogramComp(String name) {
        this.map = new HashMap<>();
        this.name = name;
        this.string = name.split(" ");
        for (int i = 0; i < string.length - 1; i++) {
            map.put(string[i], 1);
        }
    }

    private String equals() {
        return equals();
    }

    public int size() {
        return map.size();
    }

    public String get(String word) {
        return word;
    }

    @Override
    public Iterator iterator() {
        return this.map.keySet().iterator();
    }

}
