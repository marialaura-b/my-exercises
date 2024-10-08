package io.codeforall.bootcamp;

public class FileManager {

    private boolean isTrue = true;

    private boolean isFalse = false;

    private String name;

    private String user = "Maria";

    private String pass = "123";

    public FileManager(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public boolean login(){
        return isTrue;
    }

    public boolean logout(){
        return isFalse;
    }

    public File getFile(String name) {
        File file = new File("NameFile");
        return file;

    }

    public void createFile(String name){
        return;
    }
}
