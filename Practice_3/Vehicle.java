public abstract class Vehicle {
    protected String plate;
    protected String manufacturer;
    protected int year;
    protected String color;
    protected Owner owner;

    public Vehicle(String plate, String manufacturer, int year, String color, Owner owner) {
        this.plate = plate;
        this.manufacturer = manufacturer;
        this.year = year;
        this.color = color;
        this.owner = owner;
    }

    public String getPlate() {
        return plate;
    }

    public Owner getOwner() {
        return owner;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void displayInfo() {
    }
}
