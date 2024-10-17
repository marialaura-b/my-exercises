package io.codeforall.bootcamp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

    FileInputStream inputStream = new FileInputStream("resources/desperate.txt"); //Instancia classe (novo obj é atribuido a variavel inputStream)
    FileOutputStream outputStream = new FileOutputStream("resources/destino.txt");

    byte[] buffer = new byte[1024]; // armazenar os dados lidos no arquivo
    int bytesRead; // guardar a quantidade de bytes lidos em cada operação

    // Lê o arquivo de origem e escreve no arquivo de destino
    public CopyFile() throws IOException {

        while ((bytesRead = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
        }

        System.out.println("Very good!! Copied!");
        inputStream.close();
        outputStream.close();
    }
}