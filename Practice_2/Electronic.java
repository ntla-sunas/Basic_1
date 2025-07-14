import java.security.interfaces.ECKey;

public class Electronic extends Product {
    private int warrantMonths;
    private double power;

    public Electronic(String code, String name, int quantity, double unitPrice, int warrantMonths, double power) {
        super(code, name, quantity, unitPrice);
        this.warrantMonths = warrantMonths;
        this.power = power;
    }

    @Override
    public double getVAT() {
        return 0.1 * unitPrice * quantity;
    }

    @Override
    public String evalute() {
        if (quantity < 3) return "Considered sold";
        return "Not evaluated";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Warranty: " + warrantMonths + ", months, Power: " + power + "KW");
    }
}
