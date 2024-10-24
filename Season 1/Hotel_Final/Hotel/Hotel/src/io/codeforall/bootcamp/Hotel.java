package io.codeforall.bootcamp;

public class Hotel {
    private Room[] room;

    public Hotel(Room[] rooms) {
        this.room = rooms;
    }

    public void showRooms() {
        for (int i = 0; i < room.length; i++) {  // Itera sobre o array de Room e imprime cada um
            System.out.println("Room available is: " + room[i].getRoomNumber() + " | Available: " + room[i].isAvailable());
        }
    }

    public Room checkIn() {
        for (int i = 0; i < room.length; i++) {
            if (room[i].isAvailable()) {
                System.out.println("You get the room: " + room[i].getRoomNumber());
                room[i].fullRoom();
                return room[i];
            }
        }    // Retorna o quarto atribuído ou null se não houver quartos disponíveis
        System.out.println("No rooms available, get another hotel");
        return null;
    }

    // O quarto ficar livre para o que a pessoa vai fazer check-out
    public void checkOut(Room roomToCheckOut) {
        for (int i = 0; i < room.length; i++) {
            if (room[i] == roomToCheckOut && room[i].isFull()) {
                System.out.println("The room is now available again: " + room[i].getRoomNumber());
                room[i].emptyRoom();
                return;
            }
            System.out.println("No occupied rooms to check out");
        }
    }
}




