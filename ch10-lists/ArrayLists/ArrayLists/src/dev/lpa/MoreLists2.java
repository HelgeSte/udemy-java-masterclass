package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists2 {
    public static void main(String[] args) {
        ArrayList<String> groceries = new ArrayList<>();
        groceries.addAll(List.of("apples","milk","mustard", "cheese"));
        groceries.addAll(Arrays.asList("apples", "pickles", "mustard", "ham"));

        System.out.println(groceries);
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        // List to array
        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));
    }
}
