package io.codeforall.bootcamp;

import java.io.IOException;


public class Main {

    public static void main(String[] args) {
        // Exemplos de caminhos para o arquivo de origem e destino
        String sourceFile = "home/my-exercise/origem.txt";
        String destinationFile = "home/my-exercise/destino.txt";
        try {
            CopyFile copyFile = new CopyFile();

        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Deu merda");
        }
    }
}
