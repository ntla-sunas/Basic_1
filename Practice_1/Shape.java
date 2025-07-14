public class Shape {
    protected double width;
    protected double height;

    public Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void displayInfo() {
        System.out.println("Width: " + width + "Height: " + height);
    }
}

