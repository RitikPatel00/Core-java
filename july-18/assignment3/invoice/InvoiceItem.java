package assignment3.invoice;

public class InvoiceItem {

    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    
    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

   
    public String getID() {
        return this.id;
    }

    public String getDesc() {
        return this.desc;
    }

    public int getQty() {
        return this.qty;
    }

    public double getUnitPrice() {
        return this.unitPrice;
    }

  
    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

   
    public double getTotal() {
        return this.qty * this.unitPrice;
    }

    @Override
    public String toString() {
        return "InvoiceItem [id=" + this.id + ", desc=" + this.desc + ", qty=" + this.qty + ", unitPrice=" + this.unitPrice + "]";
    }
}
