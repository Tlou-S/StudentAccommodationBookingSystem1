package za.ac.cput.repository;
/**
 * BookingRepositoryImpl.java
 * implementing CRUD operations
 * Author: Tlou Masebe (230128521)
 * Date: 26 March 2026
 */

import za.ac.cput.domain.Booking;
import java.util.ArrayList;
import java.util.List;

public class BookingRepositoryImpl implements IBookingRepository {

    private static BookingRepositoryImpl repository;
    private List<Booking> bookings;

    private BookingRepositoryImpl() {
        bookings = new ArrayList<>();
    }

    public static BookingRepositoryImpl getRepository() {
        if (repository == null) {
            repository = new BookingRepositoryImpl();
        }
        return repository;
    }

    @Override
    public Booking create(Booking booking) {
        bookings.add(booking);
        return booking;
    }

    @Override
    public Booking read(String id) {
        for (int i = 0; i < bookings.size(); i++) {
            Booking b = bookings.get(i);
            if (b.getBookingId().equals(id)) {
                return b;
            }
        }
        return null;
    }

    @Override
    public Booking update(Booking booking) {
        for (int i = 0; i < bookings.size(); i++) {
            Booking b = bookings.get(i);
            if (b.getBookingId().equals(booking.getBookingId())) {
                bookings.set(i, booking);
                return booking;
            }
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        for (int i = 0; i < bookings.size(); i++) {
            Booking b = bookings.get(i);
            if (b.getBookingId().equals(id)) {
                bookings.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Booking> getAll() {
        return bookings;
    }
}