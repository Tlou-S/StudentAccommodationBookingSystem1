package za.ac.cput.domain;

public class InvoiceLine {
    private String invoiceLineId;
    private String description;
    private double quantity;
    private double unitPrice;
    private double lineTotal;

    private InvoiceLine() {}

    private InvoiceLine(Builder builder) {
        this.invoiceLineId = builder.invoiceLineId;
        this.description = builder.description;
        this.quantity = builder.quantity;
        this.unitPrice = builder.unitPrice;
        this.lineTotal = builder.lineTotal;
    }

    public String getInvoiceLineId() { return invoiceLineId; }
    public String getDescription() { return description; }
    public double getQuantity() { return quantity; }
    public double getUnitPrice() { return unitPrice; }
    public double getLineTotal() { return lineTotal; }

    @Override
    public String toString() {
        return "InvoiceLine{" +
                "invoiceLineId='" + invoiceLineId + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", lineTotal=" + lineTotal +
                '}';
    }

    public static class Builder {
        private String invoiceLineId;
        private String description;
        private double quantity;
        private double unitPrice;
        private double lineTotal;

        public Builder setInvoiceLineId(String invoiceLineId) {
            this.invoiceLineId = invoiceLineId;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setQuantity(double quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder setUnitPrice(double unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }

        public Builder setLineTotal(double lineTotal) {
            this.lineTotal = lineTotal;
            return this;
        }

        public Builder copy(InvoiceLine invoiceLine) {
            this.invoiceLineId = invoiceLine.invoiceLineId;
            this.description = invoiceLine.description;
            this.quantity = invoiceLine.quantity;
            this.unitPrice = invoiceLine.unitPrice;
            this.lineTotal = invoiceLine.lineTotal;
            return this;
        }

        public InvoiceLine build() {
            return new InvoiceLine(this);
        }
    }
}
