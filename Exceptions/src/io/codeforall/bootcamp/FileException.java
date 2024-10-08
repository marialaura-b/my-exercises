package io.codeforall.bootcamp;

public class FileException extends Exception {

    public FileException(String message) {
        super(message);
    }
}
class NotEnoughSpaceException extends FileException {
    public NotEnoughSpaceException() {
        super("Not enough space to create or modify the file.");
    }
}

class NotEnoughPermissionsException extends FileException {
    public NotEnoughPermissionsException(){
        super("You dont't have enough permissions to access the file");
    }
}