package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.*;
import static org.junit.jupiter.api.Assertions.*;

class InvoiceLineFactoryTest {

    @Test
    void testCreateInvoiceLineSuccess() {
        // Create a valid InvoiceLine
        InvoiceLine line = InvoiceLineFactory.createInvoiceLine("Dell Monitor", 2.0, 1500.0);

        // Assertions
        assertNotNull(line);
        assertNotNull(line.getInvoiceLineId()); // Check if Helper.generateId() worked
        assertEquals(3000.0, line.getLineTotal()); // Check if calculation is correct
        System.out.println("Success Test: " + line.toString());
    }

    @Test
    void testCreateInvoiceLineWithEmptyDescription() {
        // Should return null due to empty description
        InvoiceLine line = InvoiceLineFactory.createInvoiceLine("", 5.0, 100.0);

        assertNull(line);
        System.out.println("Empty Description Test: Correctly returned null");
    }

    @Test
    void testCreateInvoiceLineWithInvalidPrice() {
        // Should return null due to zero/negative price
        InvoiceLine line = InvoiceLineFactory.createInvoiceLine("Keyboard", 1.0, -50.0);

        assertNull(line);
        System.out.println("Invalid Price Test: Correctly returned null");
    }
}