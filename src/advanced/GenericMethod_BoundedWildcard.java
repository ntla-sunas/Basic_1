package advanced;

import java.util.Arrays;
import java.util.List;
public class GenericMethod_BoundedWildcard {
    public static double sum(List<? extends Number> numberList) {
        double total = 0.0;
        for (Number n : numberList) {
            total += n.doubleValue();
        }
        return  total;
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<Double> doubleList = Arrays.asList(1.2, 3.4, 7.5);

        System.out.println("Sum int: " + sum(intList));
        System.out.println("Sum double: " + sum(doubleList));
    }
}
