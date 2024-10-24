package io.codeforall.bootcamp;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            CopyFile copyFile = new CopyFile();

        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Deu merda");
        }
    }
}