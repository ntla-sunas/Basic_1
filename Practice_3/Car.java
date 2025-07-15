public class Car extends Vehicle {
    private int seats;
    private String engineType;

    public Car(String plate, String manufacturer, int year, String color, Owner owner, int seats, String engineType ) {
        super(plate, manufacturer, year, color, owner);
        this.seats = seats;
        this.engineType = engineType;
    }

    public void displayInfo() {
        System.out.println("CAR: " + plate + ", " + manufacturer + ", " + year + ", " + color);
        System.out.println("Seats: " + seats + ", Engine: " + engineType);
        System.out.println("Owner: " + owner.getName() + " - " + owner.getId());
    }
}
