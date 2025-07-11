package inheritance;

final class FinalVehicle {
    final int MAX_SPEED;

    FinalVehicle() {
        MAX_SPEED = 150;
    }

    final void showSpeed() {
        System.out.println("Max speed: " + MAX_SPEED);
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        FinalVehicle v = new FinalVehicle();
        v.showSpeed();
    }
}