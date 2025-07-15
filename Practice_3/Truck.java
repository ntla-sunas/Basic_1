public class Truck extends Vehicle{
    private double tonnage;

    public Truck(String plate, String manufacturer, int year, String color, Owner owner, double tonnage) {
        super(plate, manufacturer, year, color, owner);
        this.tonnage = tonnage;
    }

    public void displayInfo() {
        System.out.println("TRUCK: " + plate + ", " + manufacturer + ", " + year + ", " + color);
        System.out.println("Tonnage: " + tonnage + " tons");
        System.out.println("Owner: " + owner.getName() + " - " + owner.getId());
    }
}
