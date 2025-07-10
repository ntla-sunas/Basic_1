package inheritance;

class Vehicle {
    String name = "Generic";

    public String display() {
        return "Vehicle: " + name;
    }
}

class Car extends Vehicle {
    String producer = "Mercedes";

    @Override
    public String display() {
        return super.display() + ", Producer: " + producer;
    }
}

class Horse extends Vehicle {
    String species = "Arabian";

    @Override
    public String display() {
        return super.display() + ", Species: " + species;
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Horse();

        System.out.println(v1.display());
        System.out.println(v2.display());
    }
}