package io.codeforall.bootcamp;

public class Playground {
    public static void main(String[] args) {
        Room[] room = new Room[2];
        room[0] = new Room(9);
        room[1] = new Room(10);
        Hotel hotel = new Hotel(room);
        Person person = new Person(hotel);
       // Person batata = new Person(hotel);    Posso acrescentar pessoas e quartos que eu quiser.
        // Person pessego = new Person(hotel);

        person.checkRooms(hotel);      // Mostra os quartos disponíveis

        person.possibleCheckIn(hotel); // Faz check-in
        person.possibleCheckIn(hotel); // Tenta fazer check-in novamente (deve falhar)

        person.checkRooms(hotel);      // Mostra os quartos após o check-in

        person.possibleCheckOut(hotel); // Faz check-out
        person.possibleCheckIn(hotel);  // Faz check-in novamente (agora deve funcionar)

        person.checkRooms(hotel);      // Mostra os quartos após o check-out e novo check-in








    }
}
