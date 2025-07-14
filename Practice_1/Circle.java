import java.util.Optional;

public class Circle extends Shape {
    public Circle (double diameter) {
        super(diameter, diameter);
    }

    public double getArea() {
        double radius = width / 2;
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return width * Math.PI;
    }

    @Override
    public void displayInfo() {
        System.out.println("Diameter: " + width);
        System.out.println("Circle Are: " + getArea());
        System.out.println("Circle Circumference: " + getCircumference());
    }
}

