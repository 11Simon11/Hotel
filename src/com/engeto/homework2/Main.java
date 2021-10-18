package com.engeto.homework2;

import java.awt.print.Book;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Guest adela = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        Guest jan = new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));
        System.out.println(adela.getDescription());
        System.out.println(jan.getDescription());

        Room room1 = new Room(1, 1, true, true, 1000);
        Room room2 = new Room(2, 1, true, true, 1000);

        System.out.println(room1.getDescription());
        System.out.println(room2.getDescription());

        Room room3 = new Room(3, 3, false, true, 2400);

        System.out.println(room3.getDescription());

        Booking booking1 = new Booking("Adéla Malíková", 1,
                LocalDate.of(2021, 7, 19), LocalDate.of(2021,7, 26));
        Booking booking2 = new Booking("Adéla Malíková", "Jan Dvořáček", 3,
                LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14) );

        Bookings bookings = new Bookings();
        bookings.addBooking(booking1);
        bookings.addBooking(booking2);

        bookings.printBookings();

    }
}
