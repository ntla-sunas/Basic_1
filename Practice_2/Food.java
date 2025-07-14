import java.time.LocalDate;

public class Food extends Product {
    private LocalDate mfgDate;
    private LocalDate expDate;
    private String supplier;

    public Food(String code, String name, int quantity, double unitPrice, LocalDate mfgDate, LocalDate expDate, String supplier) {
        super(code, name, quantity, unitPrice);
        this.mfgDate = mfgDate;
        this.expDate = expDate;
        this.supplier = supplier;
    }

    @Override
    public double getVAT() {
        return 0.05 * unitPrice * quantity;
    }

    @Override
    public String evalute() {
        if (quantity >0 && expDate.isBefore(LocalDate.now())) {
            return "Hard to sell (expired)";
        }
        return "Not evaluated";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("MFG: " + mfgDate + ", EXP: " + expDate + ", Supplier: " + supplier);
    }
}
