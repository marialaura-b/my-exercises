package io.codeforall.bootcamp;

public class Main {

    public static final String STRING = "test word words test 1 10 1";

    public static void main(String[] args) {

        WordHistogramComp wordHistogram = new WordHistogramComp(STRING);
        System.out.println("MAP has " + wordHistogram.size() + " distinct words");

        for (String word : wordHistogram) {

            System.out.println(word + " : " + wordHistogram.get(word));
        }
    }
}
