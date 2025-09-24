package collections;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

    public static void main(String[] args) {
        List<String> L = new ArrayList<String>();

        // ADD method
        L.add("Green");
        L.add("Blue");
        L.add("White");
        System.out.println(L);

        // Get method
        System.out.println( L.get(2));

        // Set method
        L.set(1, "blue");
        System.out.println(L);

        // indexOf method
        System.out.println(L.indexOf("White"));

        // lastIndexOf method
        System.out.println(L.lastIndexOf("Green"));

        // remove method
        L.remove(2);
        System.out.println(L);

        // contains method
        System.out.println(L.contains("Blue"));

        // isEmpty method
        System.out.println( L.isEmpty());
    }
}




