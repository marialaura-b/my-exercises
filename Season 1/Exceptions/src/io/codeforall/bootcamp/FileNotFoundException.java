package io.codeforall.bootcamp;

public class FileNotFoundException extends FileException {
    public FileNotFoundException (){
        super("File not found.");
    }
}