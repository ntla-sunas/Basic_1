package advanced;

import java.util.ArrayList;

public class Collection_Example {
    public static void main(String[] args) {
        ArrayList<String> arrs = new ArrayList<>();
        arrs.add("Java");
        arrs.add("Spring");
        arrs.add("Hibernae");

        for (String item : arrs) {
            System.out.println(item);
        }
    }
}
