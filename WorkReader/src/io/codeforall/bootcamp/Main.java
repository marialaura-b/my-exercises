package io.codeforall.bootcamp;

import java.io.FileOutputStream;
import java.util.Iterator;

public class Main {

    private static final String FILE_PATH = "resources/destino.txt";

    public static void main(String[] args) {

        WordReader wordReader = new WordReader(FILE_PATH);

        for (String word : wordReader) {
            System.out.println(word);
        }

        Iterator<String> iterator = wordReader.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
