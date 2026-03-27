package za.ac.cput.factory;
/**
 * BookingFactory.java
 * creating  Booking objects
 * Author: Tlou Masebe (230128521)
 * Date: 25 March 2026
 */

import za.ac.cput.domain.Booking;
import za.ac.cput.domain.BookingStatus;
import java.time.LocalDate;

public class BookingFactory {
    public static Booking createBooking(String bookingId,
                                        String bookingDate,
                                        String startDate,
                                        String endDate,
                                        BookingStatus bookingStatus) {

        if (bookingId == null || bookingId.isEmpty()) {
            return null;
        }
        if (bookingDate == null || bookingDate.isEmpty()) {
            return null;
        }
        if (startDate == null || startDate.isEmpty()) {
            return null;
        }
        if (endDate == null || endDate.isEmpty()) {
            return null;
        }
        if (bookingStatus == null) {
            return null;
        }

        LocalDate bDate = LocalDate.parse(bookingDate);
        LocalDate sDate = LocalDate.parse(startDate);
        LocalDate eDate = LocalDate.parse(endDate);

        return new Booking.Builder()
                .setBookingId(bookingId)
                .setBookingDate(bDate)
                .setStartDate(sDate)
                .setEndDate(eDate)
                .setBookingStatus(bookingStatus)
                .build();
    }
}