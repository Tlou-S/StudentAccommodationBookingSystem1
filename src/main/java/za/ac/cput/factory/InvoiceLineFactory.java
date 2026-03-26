package za.ac.cput.factory;

import za.ac.cput.domain.InvoiceLine;
import za.ac.cput.util.Helper;

public class InvoiceLineFactory {

    public static InvoiceLine createInvoiceLine(String description, double quantity, double unitPrice) {
        if (Helper.isNullOrEmpty(description)) {
            return null;
        }

        if (quantity <= 0 || unitPrice <= 0) {
            return null;
        }

        String invoiceLineId = Helper.generateId();
        double lineTotal = quantity * unitPrice;

        return new InvoiceLine.Builder()
                .setInvoiceLineId(invoiceLineId)
                .setDescription(description)
                .setQuantity(quantity)
                .setUnitPrice(unitPrice)
                .setLineTotal(lineTotal)
                .build();
    }
}