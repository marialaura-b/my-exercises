package io.codeforall.bootcamp;

public class Main {
    public static void main(String[] args) {

        FileManager fileManager = new FileManager();

        try {
            fileManager.login();
            //fileManager.logout();

            fileManager.createFile("file1.txt");
            fileManager.createFile("file2");
            /*fileManager.createFile("file3");
            fileManager.createFile("file4");
            fileManager.createFile("file5");
            fileManager.createFile("file6");*/

            File file = fileManager.getFile("file1");
            System.out.println("File found: " + file.getName());

            fileManager.getFile("file1.txt");

        } catch (FileException e) {
            System.out.println(e.getMessage());
        } finally {
            fileManager.logout();
        }
    }
}