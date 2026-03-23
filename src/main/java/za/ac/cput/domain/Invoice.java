package za.ac.cput.domain;

import java.time.LocalDate;

public class Invoice {
    private int invoiceId;
    private String studentDetails;
    private double totalAmount;
    private LocalDate date;
    private InvoiceStatus invoiceStatus;

    private Invoice() {}

    private Invoice(Builder builder) {
        this.invoiceId = builder.invoiceId;
        this.studentDetails = builder.studentDetails;
        this.totalAmount = builder.totalAmount;
        this.date = builder.date;
        this.invoiceStatus = builder.invoiceStatus;
    }

    public int getInvoiceId() { return invoiceId; }
    public String getStudentDetails() { return studentDetails; }
    public double getTotalAmount() { return totalAmount; }
    public LocalDate getDate() { return date; }
    public InvoiceStatus getInvoiceStatus() { return invoiceStatus; }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceId=" + invoiceId +
                ", studentDetails='" + studentDetails + '\'' +
                ", totalAmount=" + totalAmount +
                ", date=" + date +
                ", invoiceStatus=" + invoiceStatus +
                '}';
    }

    public static class Builder {
        private int invoiceId;
        private String studentDetails;
        private double totalAmount;
        private LocalDate date;
        private InvoiceStatus invoiceStatus;

        public Builder setInvoiceId(int invoiceId) {
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

        public Builder setInvoiceStatus(InvoiceStatus invoiceStatus) {
            this.invoiceStatus = invoiceStatus;
            return this;
        }

        public Builder copy(Invoice invoice) {
            this.invoiceId = invoice.invoiceId;
            this.studentDetails = invoice.studentDetails;
            this.totalAmount = invoice.totalAmount;
            this.date = invoice.date;
            this.invoiceStatus = invoice.invoiceStatus;
            return this;
        }

        public Invoice build() {
            return new Invoice(this);
        }
    }
}
