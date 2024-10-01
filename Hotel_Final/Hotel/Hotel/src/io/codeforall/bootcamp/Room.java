package io.codeforall.bootcamp;

public class Room {
    private int roomNumber;
    public boolean available;



    public Room(int roomNumber) {
        this.available = true;
        this.roomNumber = roomNumber;
    }

    public void fullRoom() {
        this.available = false;
    }
    public void emptyRoom() {
        this.available = true;
    }
    public boolean isFull() {
        return !available;
    }

    public boolean isAvailable() {
        return available;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

}