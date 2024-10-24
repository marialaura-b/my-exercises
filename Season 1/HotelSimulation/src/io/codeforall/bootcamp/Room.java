package io.codeforall.bootcamp;

public class Room {
    private int roomNumber;
    public boolean available;


    public Room() {
        this.available = true;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isAvailable() {
        return available;
    }

    public boolean fullRoom() {
        return available = false;
    }

    public boolean emptyRoom() {
        return available = true;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}