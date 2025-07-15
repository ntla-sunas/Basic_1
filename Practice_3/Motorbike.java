public class Motorbike extends Vehicle{
    private double capacity;

    public Motorbike(String plate, String manufacturer, int year, String color, Owner owner, double capacity) {
        super(plate, manufacturer, year, color, owner );
        this.capacity = capacity;
    }

    public void displayInfo() {
        System.out.println("MOTORBIKE: " + plate + ", " + manufacturer + ", " + year + ", " + color);
        System.out.println("Capacity: " + capacity + "cc");
        System.out.println("Owner" + owner.getName() + " - " + owner.getId());
    }
}
