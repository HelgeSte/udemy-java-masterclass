package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAndArrayLists {
    public static void main(String[] args) {
        String[] originalArray = new String[] {"First", "Second", "Third"};
        // Returned list is NOT resizeable, but it mutable
        var originalList = Arrays.asList(originalArray);

        originalList.set(0, "one");
        System.out.println("list: " + originalList);
        System.out.println("array: " + Arrays.toString(originalArray));
        //originalList.remove(0); // causes an UnsupportedOperationException

        // Returned list is immutable
        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday");
        System.out.println(newList);
        newList.set(0, "Friday");
        System.out.println(newList);

        ArrayList<String> words = new ArrayList<>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.remove(4);
        System.out.println(words);
    }
}
