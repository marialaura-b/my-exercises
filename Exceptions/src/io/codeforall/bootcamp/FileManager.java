package io.codeforall.bootcamp;

public class FileManager {

    private boolean isLoggedIn = false;

    private File[] files;

    private int filesCreated;

    private int MAX_FILES = 5;

    public FileManager() {
        this.isLoggedIn = false;
        this.filesCreated = 0;
        this.files = new File[MAX_FILES];
    }
    public void login(){
        isLoggedIn = true;
        System.out.println("Loggin status: " + isLoggedIn);

    }

    public void logout(){
        isLoggedIn = false;
        System.out.println("Loggin status: " + isLoggedIn);
    }

    public void createFile(String fileName) throws FileException {
        //System.out.println("File created: ");
        if (!isLoggedIn) {
            System.out.println("NOT");
            throw new NotEnoughPermissionsException();
        }
        if (files.length == filesCreated) {
            //System.out.println(files.length);
            throw new NotEnoughSpaceException();
        }

        System.out.println("File created: " + fileName);
        files[filesCreated] = new File(fileName);
        filesCreated++;
    }

    public File getFile(String fileName) throws FileException {
        if (!isLoggedIn) {
            System.out.println("Not enough permissions");
            throw new NotEnoughPermissionsException();
        }

        for (int i = 0; i < filesCreated; i++ ) {
            System.out.println(files[filesCreated]);
            // .equals() compares string value
            // == compares obj reference
            if (files[i].getName().equals(fileName)) {
                return files[i];
            }
        }
        throw new FileNotFoundException();
    }
}

