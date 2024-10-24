package io.codeforall.bootcamp;

import java.util.Iterator;

public class Range implements Iterable<Integer> {

    public int firstNumber;

    public int lastNumber;

    public Range(int n1, int n2) {
        this.firstNumber = n1;
        this.lastNumber = n2;

    }


    @Override
    public Iterator<Integer> iterator() {
        return new MyLittleIterator(int firstNumber, int lastNumber);
    }
}
