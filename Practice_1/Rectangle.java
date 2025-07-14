public class Rectangle extends Shape {
    public Rectangle(double width, double height) {
        super(width, height);
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public void displayInfo() {
        System.out.println("Width: " + width + "  Height: " + height);
        System.out.println("Rectangle Area: " + getArea());
        System.out.println("Rectangle Perimeter: "+ getPerimeter());
    }
}