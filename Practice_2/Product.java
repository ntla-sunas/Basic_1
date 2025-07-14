public abstract class Product {
    protected String code;
    protected String name;
    protected int quantity;
    protected double unitPrice;

    public Product(String code, String name, int quantity, double unitPrice) {
        this.code = code;
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public abstract double getVAT();

    public abstract String evalute();

    public void displayInfo() {
        System.out.println(("Code: " + code + ", Name: " + name + ", Quantity: " + quantity + ", Unit Price: " + unitPrice));
    }

    public String getCode() {
        return code;
    }
}
