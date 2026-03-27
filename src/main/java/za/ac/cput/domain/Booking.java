package za.ac.cput.domain;

/**
 * Booking.java
 * using Builder Pattern
 * Author: Tlou Masebe (230128521)
 * Date: 24 March 2026
 */

import java.time.LocalDate;

public class Booking {

    private String bookingId;
    private LocalDate bookingDate;
    private LocalDate startDate;
    private LocalDate endDate;
    private BookingStatus bookingStatus;

    public Booking() {
    }

    public Booking(Booking.Builder builder) {
        this.bookingId = builder.bookingId;
        this.bookingDate = builder.bookingDate;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.bookingStatus = builder.bookingStatus;
    }

    public String getBookingId() {
        return bookingId;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId='" + bookingId + '\'' +
                ", bookingDate='" + bookingDate + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", bookingStatus=" + bookingStatus +
                '}';
    }

    public static class Builder {
        private String bookingId;
        private LocalDate bookingDate;
        private LocalDate startDate;
        private LocalDate endDate;
        private BookingStatus bookingStatus;

        public Booking.Builder setBookingId(String bookingId) {
            this.bookingId = bookingId;
            return this;
        }

        public Booking.Builder setBookingDate(LocalDate bookingDate) {
            this.bookingDate = bookingDate;
            return this;
        }

        public Booking.Builder setStartDate(LocalDate startDate) {
            this.startDate = startDate;
            return this;
        }

        public Booking.Builder setEndDate(LocalDate endDate) {
            this.endDate = endDate;
            return this;
        }

        public Booking.Builder setBookingStatus(BookingStatus bookingStatus) {
            this.bookingStatus = bookingStatus;
            return this;
        }
        public Builder copy(Booking booking) {
            this.bookingId = booking.bookingId;
            this.bookingDate = booking.bookingDate;
            this.startDate = booking.startDate;
            this.endDate = booking.endDate;
            this.bookingStatus = booking.bookingStatus;
            return this;
        }

        public Booking build() {
            return new Booking(this);
        }
    }
}

