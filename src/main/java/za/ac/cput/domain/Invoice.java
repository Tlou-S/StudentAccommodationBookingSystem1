package za.ac.cput.domain;

import java.time.LocalDate;
import java.util.Objects;

public class Invoice {
    private String invoiceId; // Changed from int to String
    private String studentDetails;
    private double totalAmount;
    private LocalDate date;
    // private InvoiceStatus invoiceStatus; // Ensure this enum exists in your domain package

    private Invoice() {}

    private Invoice(Builder builder) {
        this.invoiceId = builder.invoiceId;
        this.studentDetails = builder.studentDetails;
        this.totalAmount = builder.totalAmount;
        this.date = builder.date;
        // this.invoiceStatus = builder.invoiceStatus;
    }

    public String getInvoiceId() { return invoiceId; }
    public String getStudentDetails() { return studentDetails; }
    public double getTotalAmount() { return totalAmount; }
    public LocalDate getDate() { return date; }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceId='" + invoiceId + '\'' +
                ", studentDetails='" + studentDetails + '\'' +
                ", totalAmount=" + totalAmount +
                ", date=" + date +
                '}';
    }

    public static class Builder {
        private String invoiceId; // Changed to String
        private String studentDetails;
        private double totalAmount;
        private LocalDate date;

        public Builder setInvoiceId(String invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }

        public Builder setStudentDetails(String studentDetails) {
            this.studentDetails = studentDetails;
            return this;
        }

        public Builder setTotalAmount(double totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        public Builder setDate(LocalDate date) {
            this.date = date;
            return this;
        }

        public Builder copy(Invoice invoice) {
            this.invoiceId = invoice.invoiceId;
            this.studentDetails = invoice.studentDetails;
            this.totalAmount = invoice.totalAmount;
            this.date = invoice.date;
            return this;
        }

        public Invoice build() {
            return new Invoice(this);
        }
    }
}