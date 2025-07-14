public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
        Circle circle = new Circle(6);

        System.out.println("=== Rectangle Info ===");
        rect.displayInfo();

        System.out.println("\n=== Circle Info ===");
        circle.displayInfo();
    }
}
