package za.ac.cput.factory;

import za.ac.cput.domain.Booking;
import za.ac.cput.domain.BookingStatus;

public class BookingFactoryTest {
    public static void main(String[] args) {

        Booking booking = BookingFactory.createBooking(
                "B001",
                "2026-03-20",
                "2026-03-24",
                "2026-03-28",
                BookingStatus.CONFIRMED
        );

        if (booking != null) {
            System.out.println("Booking created successfully:");
            System.out.println(booking);
        } else {
            System.out.println("Booking creation failed.");
        }
    }
}