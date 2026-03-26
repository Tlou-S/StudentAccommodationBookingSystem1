package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Invoice;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class InvoiceFactoryTest {

    @Test
    void testCreateInvoiceSuccess() {
        // Test data matching your domain fields
        LocalDate testDate = LocalDate.now();
        String studentInfo = "Siyalezo - 230830811";
        double amount = 2500.00;

        // Create the invoice using the factory
        Invoice invoice = InvoiceFactory.createInvoice(testDate, studentInfo, amount);

        // Assertions
        assertNotNull(invoice);
        assertNotNull(invoice.getInvoiceId()); // Verifies Helper.generateId() worked
        assertEquals(studentInfo, invoice.getStudentDetails());
        assertEquals(testDate, invoice.getDate());
        assertEquals(amount, invoice.getTotalAmount());

        System.out.println("Success: " + invoice.toString());
    }

    @Test
    void testCreateInvoiceWithNullDate() {
        // Should return null and print "Invoice Date is null"
        Invoice invoice = InvoiceFactory.createInvoice(null, "Siyalezo", 1000.00);

        assertNull(invoice);
        System.out.println("Null Date Test: Correctly returned null");
    }

    @Test
    void testCreateInvoiceWithEmptyStudentDetails() {
        // Should return null and print "Student Details are null or empty"
        Invoice invoice = InvoiceFactory.createInvoice(LocalDate.now(), "", 500.00);

        assertNull(invoice);
        System.out.println("Empty Student Details Test: Correctly returned null");
    }

    @Test
    void testCreateInvoiceWithNegativeAmount() {
        // Should return null and print "Total Amount cannot be negative"
        Invoice invoice = InvoiceFactory.createInvoice(LocalDate.now(), "Siyalezo", -50.00);

        assertNull(invoice);
        System.out.println("Negative Amount Test: Correctly returned null");
    }
}