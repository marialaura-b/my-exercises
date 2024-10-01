package io.codeforall.bootcamp;
//Vai interagir com o Hotel e Room
public class Person {
    //private String name;
    private Hotel hotel;

    public Person(Hotel hotel) {
        //this.name = name;
        this.hotel = hotel;
    }
   public void checkRooms(Hotel hotel) {
        hotel.showRooms();
    }
   public void possibleCheckIn(Hotel hotel) {
        hotel.checkIn();
   }
   public void possibleCheckOut(Hotel hotel) {
        hotel.checkOut();
   }

}

