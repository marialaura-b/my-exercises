package io.codeforall.bootcamp;

public class Hotel {
    private Room[] room;

    public Hotel(Room[] room) {
        this.room = room;
    }

    public void showRooms() {
        for (int i = 0; i < room.length; i++) {  // Itera sobre o array de Room e imprime cada um
            room[i].setRoomNumber(i);
            System.out.println("Rooms available are: " + room[i].getRoomNumber() + " Available: " + room[i].isAvailable());
        }
    }

    public void checkIn() {
        for (int i = 0; i < room.length; i++) {
            if (room[i].isAvailable()) {
                room[i].fullRoom();
                System.out.println("You get the room, " + room[i].getRoomNumber());
                //room[i].fullRoom()
            }
            else {
                System.out.println("No rooms available, get another hotel");
            }
        }
        return;
    }
    public void checkOut() {
        for (int i = 0; i < room.length; i++) {
            if (!room[i].isAvailable()) {
                room[i].emptyRoom();
                System.out.println("The room is available again " + room[i].getRoomNumber())/*  + "--.--.--" + room[i].available)*/;
                //room[i].emptyRoom();
            }
        }
       System.out.println("No rooms are currently occupied.");
    }
}




