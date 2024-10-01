package io.codeforall.bootcamp;

public class Playground {
    public static void main(String[] args) {
        Room[] room = new Room[2];
        room[0] = new Room();
        room[1] = new Room();
        Hotel hotel = new Hotel(room);
        Person person = new Person(hotel);

        System.out.println("______________________________");
        System.out.println("Room Status:");
        person.checkRooms(hotel);
        System.out.println("______________________________");
        System.out.println("Check In:");
        person.possibleCheckIn(hotel);
        System.out.println("______________________________");
        System.out.println("Room Status:");
        person.checkRooms(hotel);
        System.out.println("_______________________________");
        System.out.println("Check Out:");
        person.possibleCheckOut(hotel);
        System.out.println("_______________________________");
        System.out.println("Room Status:");
        person.checkRooms(hotel);
    }
}
