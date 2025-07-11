package advanced;

interface Test {
    void setup();

    default void run() {
        System.out.println("Hello Tester");
    }
}
public class Lambda_FunctionalInterface {
    public static void main(String[] args) {
        Test test = () -> {
            System.out.println(("Setup environment is here"));
        };

        test.setup();
        test.run();
    }
}
