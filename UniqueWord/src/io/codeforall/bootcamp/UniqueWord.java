package io.codeforall.bootcamp;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class UniqueWord implements Iterable<String>{

    private HashSet<String> name;

    public UniqueWord(String allName){
        this.name = new HashSet(List.of(allName.split(" ")));
    }

    @Override
    public Iterator<String> iterator() {
        return name.iterator();
    }

}
