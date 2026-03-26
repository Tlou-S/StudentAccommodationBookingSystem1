package za.ac.cput.repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Booking;
import za.ac.cput.domain.BookingStatus;
import za.ac.cput.factory.BookingFactory;

import static org.junit.jupiter.api.Assertions.*;

class BookingRepositoryTest {

    private BookingRepositoryImpl repository = BookingRepositoryImpl.getRepository();

    @Test
    void testCreateReadUpdateDelete() {
        Booking booking = BookingFactory.createBooking(
                "B011",
                "2026-03-24",
                "2026-03-30",
                "2026-04-03",
                BookingStatus.CONFIRMED
        );
        repository.create(booking);
        System.out.println("Created: " + booking);
        assertEquals(1, repository.getAll().size());

        Booking readBooking = repository.read("B011");
        System.out.println("Read: " + readBooking);
        assertNotNull(readBooking);
        assertEquals("B011", readBooking.getBookingId());

        Booking updatedBooking = new Booking.Builder()
                .copy(readBooking)
                .setBookingStatus(BookingStatus.CANCELLED)
                .build();
        repository.update(updatedBooking);
        Booking checkUpdate = repository.read("B011");
        System.out.println("Updated: " + checkUpdate);
        assertEquals(BookingStatus.CANCELLED, checkUpdate.getBookingStatus());

        repository.delete("B011");
        System.out.println("Deleted, remaining bookings: " + repository.getAll().size());
        assertNull(repository.read("B001"));
        assertEquals(0, repository.getAll().size());

        System.out.println(" Test is Completed Successfully ");
    }
}
