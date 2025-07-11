package interfaces;

public class Interface_Example {
    public static void main(String[] args) {
        System.out.println("1. Khai bao interface:");
        Actives p = new Persons();
        p.run();
        p.sound();

        Actives c = new Cat();
        c.run();
        c.sound();
        System.out.println();

        System.out.println("2. Nested interface");
        Showable.Message  msg = new NestedExample();
        msg.printMessage();
        System.out.println();

        System.out.println("3. Default và static method");
        MyTool tool = new MyTool();
        tool.info();
        Tool.utility();
        System.out.println();

        System.out.println("4. Practice");
        Shape s = new Square(4);
        Shape r = new Rectangle(2, 9);

        System.out.println("Square are: " + s.area());
        System.out.println("Rectangle perimeter: " + r.perimeter());

    }
}
// 1. Khai báo interface
interface Actives {
    void run();
    void sound();
}
class Persons implements Actives {
    public void run() {
        System.out.println("Person run");
    }
    public void sound() {
        System.out.println("Person talk hello");
    }
}
class Cat implements Actives {
    public void run() {
        System.out.println("Cat run");
    }

    public void sound() {
        System.out.println("Mew mew");
    }
}
// 2. Nested interface : interface lồng nhau
interface Showable {
    void show();

    interface Message {
        void printMessage();
    }
}

class NestedExample implements Showable.Message {
    public void printMessage() {
        System.out.println("Hello nested interface!");
    }
}
// 3. Default và static method
interface Tool {
    default void info() {
        System.out.println("Tool info");
    }

    static void utility() {
        System.out.println("Static utility from Tool");
    }
}

class MyTool implements Tool {}
// 4. Practice
interface Shape {
    double area();
    double perimeter();
}

class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }
}

class Rectangle implements Shape {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}