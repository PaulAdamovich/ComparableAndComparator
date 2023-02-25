package org.example.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Maria");
        names.add("Petr");
        names.add("Andrey");
        names.add("Zlatan");
        System.out.println("Before sorting");
        System.out.println(names);
        Collections.sort(names);
        System.out.println("After sorting");
        System.out.println(names);
    }
}
