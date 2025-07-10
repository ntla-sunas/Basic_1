package inheritance;

import java.security.Key;

class Parentclass {
    String keyTrain = "Train from Parent";

    public Parentclass() {
        System.out.println("Constructor of Superclass");
    }

    public void print() {
        System.out.println("Parent: " + keyTrain);
    }
}

class Subclass extends Parentclass {
    String keyTrain = "Train from Subclass";

    public Subclass() {
        super();
        System.out.println("Consuctor of Subclass");
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Subclass: " + keyTrain);
    }

    public void printMessage() {
        System.out.println("Access from super: " + super.keyTrain);
    }

    public static void main (String[] args) {
        Subclass obj = new Subclass();
        obj.print();
        obj.print();
    }
}
