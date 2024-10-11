package io.codeforall.bootcamp;

import java.util.Iterator;

public class MyLittleIterator implements Iterator {

    private int firstNumber;

    private int lastNumber;

    public MyLittleIterator(int firstNumber, int lastNumber){
        this.firstNumber = firstNumber;
        this.lastNumber = lastNumber;
    }

    @Override
    public boolean hasNext() { //Checks if there are more elements in the range
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
