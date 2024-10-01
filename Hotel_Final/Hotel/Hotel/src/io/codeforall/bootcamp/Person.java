package io.codeforall.bootcamp;

public class Person {

    private Hotel hotel;
    private Room currentRoom; // Armazena o quarto atual da pessoa

    public Person(Hotel hotel) {
        this.hotel = hotel;
        this.currentRoom = null; // Inicialmente, a pessoa não está hospedada em nenhum quarto
    }

    public void checkRooms(Hotel hotel) {
        hotel.showRooms();
    }

    public void possibleCheckIn(Hotel hotel) {
        // Verifica se a pessoa já está hospedada
        if (currentRoom != null) {
            System.out.println("You are already in room: " + currentRoom.getRoomNumber() + ". You need to check out before checking into another room.");
            return;
        }

        // Se não estiver hospedada, tenta fazer check-in
        Room room = hotel.checkIn();
        if (room != null) {
            currentRoom = room; // Atribui o quarto atual à pessoa
        }
    }

    public void possibleCheckOut(Hotel hotel) {
        // Verifica se a pessoa está hospedada em algum quarto
        if (currentRoom == null) {
            System.out.println("You are not currently in any room. Can't check out.");
            return;
        }

        // Se estiver hospedada, faz check-out
        hotel.checkOut(currentRoom);
        currentRoom = null; // O quarto fica livre após o check-out
    }
}



