import java.time.LocalDate;

public class Crockery extends Product{
    private String manufacturer;
    private LocalDate storageDate;

    public Crockery(String code, String name, int quantity, double unitPrice, String manufacturer,LocalDate storageDate ) {
        super(code, name, quantity, unitPrice);
        this.manufacturer = manufacturer;
        this.storageDate = storageDate;
    }

    @Override
    public double getVAT() {
        return 0.1 * unitPrice * quantity;
    }

    @Override
    public String evalute() {
        if (quantity > 50 && storageDate.plusDays(10).isBefore(LocalDate.now())) {
            return "Slow sale";
        }
        return "Not evaluated";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Manufacturer: " + manufacturer + ", Storage Date: " + storageDate);
    }
}
