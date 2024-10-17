package io.codeforall.bootcamp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Iterator;
import java.io.IOException;

public class WordReader implements Iterable<String> {

    private String filePath;

    private String[] words;

    public WordReader(String filePath) {
        this.filePath = filePath;
        try {
            this.readFileByLine(filePath);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private String readFileByLine(String file) throws IOException {
        // create a new file reader
        FileReader reader = new FileReader(file);
        // wrap the file reader using a buffered reader
        BufferedReader bReader = new BufferedReader(reader);

        String line = "";
        String result = "";
        // using the buffered reader we can read lines
        while ((line = bReader.readLine()) != null) {
            result += line + "\n";
        }
        bReader.close();

        this.words = result.split(" ");

        return result;
    }
        @Override
        public Iterator<String> iterator () {
            return Arrays.stream(this.words).iterator();
        }
    }