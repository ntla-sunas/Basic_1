import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        manager.addProduct(new Food("F01", "Milk", 10, 2.0, LocalDate.of(2024, 7, 1), LocalDate.of(2025, 1, 1), "Vinamilk"));
        manager.addProduct(new Electronic("E01", "Microwave", 2, 100.0, 12, 1.5));
        manager.addProduct(new Crockery("C01", "Vase", 60, 3.5, "Minh Long", LocalDate.of(2025, 6, 20)));

        System.out.println("=== INVENTORY ===");
        manager.showAll();

        System.out.println("\n=== QUANTITY BY TYPE ===");
        manager.showQuantityByType();
    }
}
