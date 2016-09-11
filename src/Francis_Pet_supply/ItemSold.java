package Francis_Pet_supply;

/**
 * Created by ACfan on 11/09/2016.
 */
public class ItemSold {
    private int invoiceNo;
    private String description;
    private double price;

    public int getInvoiceNo() {
        return invoiceNo;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setInvoiceNo(int invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
