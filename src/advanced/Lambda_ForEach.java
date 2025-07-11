package advanced;

import java.util.Arrays;
import java.util.List;

public class Lambda_ForEach {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java", "Spring", "Hibernate");

        // Traditional loop
        System.out.println("Traditional: ");
        for (String name: names) {
            System.out.println(name);
        }
        System.out.println();

        // Lambda
        System.out.println("With Lambda: ");
        names.forEach(name -> System.out.println(name) );
    }
}
