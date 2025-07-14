import java.util.ArrayList;

public class InventoryManager {
    private ArrayList<Product> products;

    public InventoryManager() {
        products = new ArrayList<>();
    }

    public boolean addProduct(Product p) {
        for (Product prod : products) {
            if (prod.getCode().equalsIgnoreCase(p.getCode())) {
                System.out.println("Duplicate code!");
                return false;
            }
        }
        products.add(p);
        return true;
    }
    public void showAll() {
        for (Product p : products) {
            p.displayInfo();
            System.out.println("VAT: " + p.getVAT());
            System.out.println("Evaluate: " + p.evalute());
            System.out.println("-------------------");
        }
    }

    public void showQuantityByType() {
        int food = 0, elec = 0, crock = 0;
        for (Product p : products) {
            if (p instanceof Food) food += p.quantity;
            else if (p instanceof Electronic) elec += p.quantity;
            else if (p instanceof Crockery) crock += p.quantity;
        }
        System.out.println("Quantity - Food: " + food + ", Electronic: " + elec + ", Crockery: " + crock);
    }
}
