package za.ac.cput.factory;

import za.ac.cput.domain.Invoice;
import za.ac.cput.util.Helper;
import java.time.LocalDate;

public class InvoiceFactory {

    public static Invoice createInvoice(LocalDate invoiceDate, String studentDetails, double totalAmount) {
        // Validation
        if (invoiceDate == null) {
            System.out.println("Invoice Date is null");
            return null;
        }

        if (Helper.isNullOrEmpty(studentDetails)) {
            System.out.println("Student Details are null or empty");
            return null;
        }

        if (totalAmount < 0) {
            System.out.println("Total Amount cannot be negative");
            return null;
        }

        // generateId returns a String, so Invoice.invoiceId must be a String!
        String invoiceId = Helper.generateId();

        return new Invoice.Builder()
                .setInvoiceId(invoiceId)      // Matches Builder.setInvoiceId(String)
                .setDate(invoiceDate)         // Matches Builder.setDate(LocalDate)
                .setStudentDetails(studentDetails) // Matches Builder.setStudentDetails(String)
                .setTotalAmount(totalAmount)  // Matches Builder.setTotalAmount(double)
                .build();
    }
}