package io.codeforall.bootcamp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {


    FileInputStream inputStream = new FileInputStream("resources/origem.txt");
    FileOutputStream outputStream = new FileOutputStream("resources/destino.txt");

    byte[] buffer = new byte[1024]; // Buffer de 1 KB
    int bytesRead;


    // Lê o arquivo de origem e escreve no arquivo de destino
    public CopyFile() throws IOException {

        while ((bytesRead = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
        }

        System.out.println("Arquivo copiado com sucesso!");
        inputStream.close();
        outputStream.close();
    }

} /*catch (IOException e) {
        System.out.println("Erro ao copiar o arquivo: "+e.getMessage());
        }*/



