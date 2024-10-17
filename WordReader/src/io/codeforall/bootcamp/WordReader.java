package io.codeforall.bootcamp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Iterator;
import java.io.IOException;

public class WordReader implements Iterable<String> {

    private String filePath; //Armazena o caminho do arquivo

    private String[] words; //Armazena as palavras lidas

    public WordReader(String filePath) {
        this.filePath = filePath; // Atribui o caminho do arquivo à variável de instância.
        try {
            this.words = this.readFileByLine(filePath);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    // Lança uma exceção IOException se houver um erro ao acessar o arquivo
    private String[] readFileByLine(String file) throws IOException {
        // create a new file reader
        FileReader reader = new FileReader(file);
        // wrap the file reader using a buffered reader
        BufferedReader bReader = new BufferedReader(reader);
        //Inicializa Strings vazias
        String line = "";
        String result = "";
        // using the buffered reader we can read lines
        while ((line = bReader.readLine()) != null) {
            result += line + "\n"; // Adiciona a linha lida à string result, seguida de uma quebra de linha
        }
        bReader.close();

        return result.split(" ");

    }
        @Override
        public Iterator<String> iterator () {
            return Arrays.stream(this.words).iterator();
        }
    }