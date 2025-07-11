package inheritance;

abstract class VehicleAbstract {
    String name;
    String color;

    abstract void speed();

    public String display() {
        return "Vehicle: " + name + ", Color: " + color;
    }
}

abstract class CarAbstract extends VehicleAbstract{
    String producer = "Honda";

    @Override
    public String display() {
        return super.display() + ", Producer: " + producer;
    }

    public static void main(String[] args) {
        CarAbstract car = new CarAbstract() {
            void speed() {}
        };
        car.name = "City";
        car.color = "Red";
        car.speed();
        System.out.println(car.display());
    }

}
